import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {AuthService} from '../service/auth.service'

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private route : Router , private authService : AuthService) { }

  ngOnInit() {
  }

  clickOnAddParking(){
    this.route.navigate(['add-parking']);
  }

  clickOnListParking(){
    this.route.navigate(['list-parking']);
  }

  clickOnListBooking(){
    this.route.navigate(['bookinglist']);
  }

  logout(){
    sessionStorage.clear();
    this.authService.setLoggedIn(false);
    this.route.navigate(['login']);
    
  }

}
