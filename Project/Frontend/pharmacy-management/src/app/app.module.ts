import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { MedicineComponent } from './shared/medicine/medicine.component';
import { ManageCustomerComponent } from './pharmacist/manage-customer/manage-customer.component';
import { CartComponent } from './pharmacist/cart/cart.component';
import { ManageMedicineComponent } from './admin/manage-medicine/manage-medicine.component';
import { InventoryComponent } from './admin/inventory/inventory.component';
import { SignUpComponent } from './shared/sign-up/sign-up.component';
import { SignInComponent } from './shared/sign-in/sign-in.component';
import { NavBarComponent } from './shared/nav-bar/nav-bar.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NotAuthorizedComponent } from './shared/not-authorized/not-authorized.component';

@NgModule({
  declarations: [
    AppComponent,
    MedicineComponent,
    ManageCustomerComponent,
    CartComponent,
    ManageMedicineComponent,
    InventoryComponent,
    SignUpComponent,
    SignInComponent,
    NavBarComponent,
    NotAuthorizedComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
