import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MedicineComponent } from './shared/medicine/medicine.component';
import { ManageCustomerComponent } from './pharmacist/manage-customer/manage-customer.component';
import { CartComponent } from './pharmacist/cart/cart.component';
import { ManageMedicineComponent } from './admin/manage-medicine/manage-medicine.component';
import { InventoryComponent } from './admin/inventory/inventory.component';
import { SignUpComponent } from './shared/sign-up/sign-up.component';
import { SignInComponent } from './shared/sign-in/sign-in.component';

const routes: Routes = [
  { path: '', redirectTo: '/medicine', pathMatch: 'full'},
  { path: 'medicine', component:  MedicineComponent },
  { path: 'manageCustomer', component:  ManageCustomerComponent },
  { path: 'cart', component:  CartComponent },
  { path: 'manageMedicine', component:  ManageMedicineComponent },
  { path: 'inventory', component:  InventoryComponent },
  { path: 'signUp', component:  SignUpComponent },
  { path: 'signIn', component:  SignInComponent },
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
