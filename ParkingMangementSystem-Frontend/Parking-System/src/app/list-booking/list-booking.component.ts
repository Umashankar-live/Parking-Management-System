import { Component, OnInit } from '@angular/core';
import { BookSlot } from '../Models/bookslot.model';
import { AdminService } from '../service/admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-booking',
  templateUrl: './list-booking.component.html',
  styleUrls: ['./list-booking.component.css']
})
export class ListBookingComponent implements OnInit {
  bookingList: BookSlot[] = [];

  constructor(private service: AdminService, private route: Router) { }

  ngOnInit() {
    setTimeout(() => { this.reloadData() }, 100);
  }


  reloadData() {
     this.service.fetchAllBooking().subscribe(data => {
      this.bookingList = data;
      console.log(this.bookingList);
    })
  }

  remove(index: number) {
    var ans = confirm("Are you sure you want to delete?");
    if (ans) {
      this.service.deleteBooking(index).subscribe(response => {
        this.reloadData();
        
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
