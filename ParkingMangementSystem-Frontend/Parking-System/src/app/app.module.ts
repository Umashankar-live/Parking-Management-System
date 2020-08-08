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
<<<<<<< HEAD
import { BookSlotComponent } from './book-slot/book-slot.component';

=======
import { BookParkingComponent } from './book-parking/book-parking.component';
import { BookingInfoComponent } from './booking-info/booking-info.component';
>>>>>>> ae50ecdbb54ea1f1c1de16bd8609f0a85d452115

const routes : Routes = [
  {path:'login', component:LoginComponent},
  {path:'admin' , component:AdminComponent},
  {path:'customer',component:CustomerComponent},
  {path:'register',component:RegisterComponent},
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
<<<<<<< HEAD
    BookSlotComponent,
    
=======
    BookParkingComponent,
    BookingInfoComponent
>>>>>>> ae50ecdbb54ea1f1c1de16bd8609f0a85d452115
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes)

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
