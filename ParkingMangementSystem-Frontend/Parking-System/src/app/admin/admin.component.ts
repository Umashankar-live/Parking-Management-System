import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../service/auth.service'
import { UserService } from '../service/user.service';
import { UserModel } from '../Models/customer.model';

@Component({
  selector: 'app-admin', // used for accessing the component
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  userList: UserModel[] = [];
  page: number = 1;
  constructor(private route: Router, private authService: AuthService, private userService: UserService) { }

  ngOnInit() {
    setTimeout(() => { this.reloadData() }, 100);

  }

  reloadData() {
    this.userService.fetchAllUser().subscribe(data => {
      this.userList = data;
      console.log(this.userList);
    })
  }


  /* Methods for the Admin Portal */
  clickOnAddParking() {
    this.route.navigate(['add-parking']);
  }

  clickOnListParking() {
    this.route.navigate(['list-parking']);
  }

  clickOnListBooking() {
    this.route.navigate(['bookinglist']);
  }

  logout() {
    sessionStorage.clear();
    this.authService.setLoggedIn(false);
    this.route.navigate(['login']);

  }

}
