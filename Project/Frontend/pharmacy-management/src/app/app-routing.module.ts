import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MedicineComponent } from './shared/medicine/medicine.component';
import { ManageCustomerComponent } from './pharmacist/manage-customer/manage-customer.component';
import { CartComponent } from './pharmacist/cart/cart.component';
import { ManageMedicineComponent } from './admin/manage-medicine/manage-medicine.component';
import { InventoryComponent } from './admin/inventory/inventory.component';
import { SignUpComponent } from './shared/sign-up/sign-up.component';
import { SignInComponent } from './shared/sign-in/sign-in.component';
import { NotAuthorizedComponent } from './shared/not-authorized/not-authorized.component';
import { RoleGuardGuard } from './role-guard.guard';

const routes: Routes = [
  { path: '', redirectTo: '/signIn', pathMatch: 'full'},
  { path: 'medicine', component:  MedicineComponent, canActivate: [RoleGuardGuard], data: { expected: 'Common' } },
  { path: 'manageCustomer', component:  ManageCustomerComponent, canActivate: [RoleGuardGuard], data: { expectedRole: 2 } },
  { path: 'cart', component:  CartComponent, canActivate: [RoleGuardGuard], data: { expectedRole: 2 } },
  { path: 'manageMedicine', component:  ManageMedicineComponent, canActivate: [RoleGuardGuard], data: { expectedRole: 1 }},
  { path: 'inventory', component:  InventoryComponent, canActivate: [RoleGuardGuard], data: { expectedRole: 1 } },
  { path: 'signUp', component:  SignUpComponent },
  { path: 'signIn', component:  SignInComponent },
  { path: 'notAuthorized', component: NotAuthorizedComponent }
];
/*
role 1 => Admin => [medicine, manageMedicine, inventory]
role 2 => Pharmacist => [medicine, manageCustomer, cart]
*/

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
