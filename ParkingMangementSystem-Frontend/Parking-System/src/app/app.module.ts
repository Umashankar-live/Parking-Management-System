/* Every Angular app consists of a file named angular.json. This file will contain all the configurations 
of the app. While building the app, the builder looks at this file to find the entry point of the
 application */

 /* Inside the build section, the main property of the options object defines the entry point of the 
 application which in this case is main.ts.The main.ts file creates a browser environment for the 
 application to run, and, along with this, it also calls a function called bootstrapModule, 
 which bootstraps the application  */

 /* AppModule is getting bootstrapped.The AppModule is declared in the app.module.ts file. 
 This module contains declarations of all the components. */


import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import {Ng2SearchPipeModule} from 'ng2-search-filter'; // used for search using filter pipe in frontend 
import {NgxPaginationModule} from 'ngx-pagination'; // used for pagination

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


//path for all the component used in the project for routing
const routes : Routes = [
  {path:'login', component:LoginComponent},
  {path:'admin' , component:AdminComponent,canActivate: [AuthGuard]}, //CanActivate is an Angular interface. 
  {path:'customer',component:CustomerComponent,canActivate: [AuthGuard]},//It is used to force user to login into application before navigating to the route.
  {path:'register',component:RegisterComponent},
  {path:'list-parking',component:ListParkingComponent,canActivate: [AuthGuard]},
  {path:'list-booking',component:BookParkingComponent,canActivate: [AuthGuard]},
  {path:'bookparking',component:BookParkingComponent,canActivate: [AuthGuard]},
  {path:'userlist',component:UserListComponent,canActivate: [AuthGuard]},
  {path:'slot',component:SlotInfoComponent,canActivate: [AuthGuard]},
  {path:'bookinginfo/:bname',component:BookingInfoComponent,canActivate: [AuthGuard]},
  {path:'add-parking',component:AddParkingComponent,canActivate: [AuthGuard]},
  {path:'list-parking',component:ListParkingComponent,canActivate: [AuthGuard]},
  {path:'bookinglist',component:ListBookingComponent,canActivate: [AuthGuard]},
  {path:'list-slot/:loc/:typ',component:ListSlotComponent,canActivate: [AuthGuard]},
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
    BrowserModule, // it is used to the angular app in the browser
    FormsModule, //used for creating different form in angular
    HttpClientModule, // it used to interpet for the HLML request and response and desired output
    RouterModule.forRoot(routes), // it is used for the in-app navigation between diffrent component
    BrowserAnimationsModule,//introduces the animation capabilities into our Angular root application module
    Ng2SearchPipeModule,// it is used for using fiter pipe for filtering the list results
    NgxPaginationModule //it is used for adding pagiation to the list

    
  ],
  providers: [],
  bootstrap: [AppComponent] // AppComponent is getting bootstrapped.
  //This component is defined in app.component.ts file. This file interacts with the webpage and serves data to it
})

export class AppModule { }
