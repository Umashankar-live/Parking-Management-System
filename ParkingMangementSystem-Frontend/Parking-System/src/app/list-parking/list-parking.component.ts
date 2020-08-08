import { Component, OnInit } from '@angular/core';
import { Parking } from '../Models/parking.model';
import { AdminService } from '../service/admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-parking',
  templateUrl: './list-parking.component.html',
  styleUrls: ['./list-parking.component.css']
})
export class ListParkingComponent implements OnInit {
  parkingList: Parking[] = [];

  constructor(private service: AdminService, private route: Router) { }

  ngOnInit() {
    setTimeout(() => { this.reloadData() }, 100);

  }

  reloadData() {
    this.service.fetchAllParking().subscribe(data => {
      this.parkingList = data;
      console.log(this.parkingList);
    })

  }

  remove(index: number) {
    var ans = confirm("Are you sure you want to delete?");
    if (ans) {
      this.service.deleteParking(index).subscribe(response => {
        this.reloadData();
        console.log(this.parkingList);
      });
    }
  }

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
    this.route.navigate(['login']);
  }

}