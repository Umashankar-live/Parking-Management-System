import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../service/customer.service';
import { BookSlot } from '../Models/bookslot.model';


@Component({
  selector: 'app-booking-info',
  templateUrl: './booking-info.component.html',
  styleUrls: ['./booking-info.component.css']
})
export class BookingInfoComponent implements OnInit {
  bookingName : String 
  book : BookSlot[] = []
  bname: string;


  constructor(private route:ActivatedRoute,private router:Router,private service: CustomerService) {
      
   }

  ngOnInit() {
    this.route.params.subscribe(x=>this.bookingName=x['bname']);
    console.log(this.bookingName);
    this.service.getBookingByName(this.bookingName).subscribe(data =>{
      this.book=data;
      console.log(this.book);
    });
 
 }

clickOnBook(){
  this.router.navigate(['bookparking']);
}

clickOnBookInfo(){
  this.bname= sessionStorage.getItem('userName')
    this.router.navigate(['bookinginfo',this.bname]);
  }

clickOnregister(){
  this.router.navigate(['userlist']);
}

logout(){
  sessionStorage.clear();
  this.router.navigate(['login']);
}


 
}
