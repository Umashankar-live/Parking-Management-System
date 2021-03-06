import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Parking } from "../Models/parking.model";
import { AdminService } from '../service/admin.service';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-add-parking', // used for accessing the component
  templateUrl: './add-parking.component.html',
  styleUrls: ['./add-parking.component.css']
})
export class AddParkingComponent implements OnInit {
  parking: Parking;
  
  constructor(private route: Router, private service: AdminService, private auth: AuthService) { }

  ngOnInit() {
    this.parking = new Parking();
    this.parking.location = null;

  }

  /* Function for saving the parking form */
  saveParking() {
    this.parking.fourWheelerAvailable = this.parking.fourWheelerTotal ;
    this.parking.twoWheelerAvailable = this.parking.twoWheelerTotal ;
    console.log(this.parking);
    this.service.addParking(this.parking).subscribe(response => {

      this.route.navigate(['list-parking']);
    })

  }


  /* Option for the Admin Menu */
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
    this.auth.setLoggedIn(false);
    this.route.navigate(['login']);
  }


}
