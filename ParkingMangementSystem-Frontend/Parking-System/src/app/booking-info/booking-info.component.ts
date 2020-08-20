import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../service/customer.service';
import { AdminService } from '../service/admin.service';
import { BookSlot } from '../Models/bookslot.model';
import { AuthService } from '../service/auth.service';


@Component({
  selector: 'app-booking-info', // used for accessing the component
  templateUrl: './booking-info.component.html',
  styleUrls: ['./booking-info.component.css']
})
export class BookingInfoComponent implements OnInit {
  bookingName: String
  book: BookSlot[] = []
  bname: string;
  page: number = 1;
 

  constructor(private route: ActivatedRoute, private router: Router, private service: CustomerService,
    private adminService: AdminService, private authService : AuthService) {

  }

  ngOnInit() {
    this.route.params.subscribe(x => this.bookingName = x['bname']);
    console.log(this.bookingName);
    this.service.getBookingByName(this.bookingName).subscribe(data => {
      this.book = data;
      console.log(this.book);
    });

  }

  reloadData() {
    this.service.getBookingByName(this.bookingName).subscribe(data => {
      this.book = data;
      console.log(this.book);
    });
  }


  remove(index: number) {
    var ans = confirm("Are you sure you want to cancel?");
    if (ans) {
      this.adminService.deleteBooking(index).subscribe(response => {
        this.reloadData();

      });
    }

  }
  

  clickOnBook() {
    this.router.navigate(['bookparking']);
  }

  clickOnBookInfo() {
    this.bname = sessionStorage.getItem('userName')
    this.router.navigate(['bookinginfo', this.bname]);
  }

  clickOnregister() {
    this.router.navigate(['userlist']);
  }

  logout() {
    sessionStorage.clear();
    this.authService.setLoggedIn(false);
    this.router.navigate(['login']);
  }



}
