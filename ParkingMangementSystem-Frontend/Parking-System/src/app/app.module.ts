import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { RegisterComponent } from './register/register.component';
import { CustomerComponent } from './customer/customer.component';
import { BookParkingComponent } from './book-parking/book-parking.component';
import { BookingInfoComponent } from './booking-info/booking-info.component';
import { UserListComponent } from './user-list/user-list.component';
import { SlotInfoComponent } from './slot-info/slot-info.component';
import { AddParkingComponent } from './add-parking/add-parking.component';
import { ListParkingComponent } from './list-parking/list-parking.component';
import { ListBookingComponent } from './list-booking/list-booking.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ListSlotComponent } from './list-slot/list-slot.component';

const routes : Routes = [
  {path:'login', component:LoginComponent},
  {path:'admin' , component:AdminComponent},
  {path:'customer',component:CustomerComponent},
  {path:'register',component:RegisterComponent},
  {path:'list-parking',component:ListParkingComponent},
   {path:'list-booking',component:BookParkingComponent},
// <<<<<<< HEAD
//   {path:'customer/bookparking',component:BookParkingComponent},
//   {path:'customer/userlist',component:UserListComponent},
//   {path:'slot',component:SlotInfoComponent},
//   {path:'bookinginfo',component:BookingInfoComponent},
// =======
  {path:'bookparking',component:BookParkingComponent},
  {path:'userlist',component:UserListComponent},
  {path:'slot',component:SlotInfoComponent},
  {path:'bookinginfo/:bname',component:BookingInfoComponent},
  {path:'add-parking',component:AddParkingComponent},
  {path:'list-parking',component:ListParkingComponent},
  {path:'bookinglist',component:ListBookingComponent},
  {path:'list-slot/:loc/:typ',component:ListSlotComponent},
  {path:'', redirectTo:'login', pathMatch:"full"},
  {path:'*', redirectTo:'login', pathMatch:"full"},
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    RegisterComponent,
    CustomerComponent,
    BookParkingComponent,
    BookingInfoComponent,
    UserListComponent,
    SlotInfoComponent,
    AddParkingComponent,
    ListParkingComponent,
    ListBookingComponent,
    ListSlotComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    BrowserAnimationsModule

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
