import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { Router } from '@angular/router';
import { Parking } from "../Models/parking.model";
import { AdminService } from '../service/admin.service';
=======
import {Router} from '@angular/router';
import {Parking} from '../Models/parking.model';
import {AdminService} from '../service/admin.service';
import { THROW_IF_NOT_FOUND } from '@angular/core/src/di/injector';
>>>>>>> 07c5934e86432d787a11bc8741c118e5c82af1ea

@Component({
  selector: 'app-add-parking',
  templateUrl: './add-parking.component.html',
  styleUrls: ['./add-parking.component.css']
})
export class AddParkingComponent implements OnInit {
  parking: Parking;
  constructor(private route: Router, private service: AdminService) { }

  ngOnInit() {
<<<<<<< HEAD
    this.parking.location = null ;
  }

  saveParking() {
    this.parking.fourWheelerAvailable = this.parking.fourWheelerTotal;
    this.parking.twoWheelerAvailable = this.parking.twoWheelerTotal;
    console.log(this.parking);
    this.service.addParking(this.parking).subscribe(response => {
      this.route.navigate(['list-parking']);
    })
=======
    this.parking = new Parking;
    this.parking.fourWheelerAvailable = this.parking.fourWheelerTotal ;
    this.parking.twoWheelerAvailable = this.parking.twoWheelerTotal ;
  }

  saveParking(){
    
    console.log(this.parking.location);
    // this.service.addParking(this.parking).subscribe(response => {
    //   this.route.navigate(['list-parking']);
    // })
>>>>>>> 07c5934e86432d787a11bc8741c118e5c82af1ea

  }

  clickOnAddParking() {
    this.route.navigate(['add-parking']);
  }

  clickOnListParking() {
    this.route.navigate(['list-parking']);
  }

  clickOnListBooking() {
    this.route.navigate(['list-booking']);
  }

  logout() {
    sessionStorage.clear();
    this.route.navigate(['login']);
  }


}
