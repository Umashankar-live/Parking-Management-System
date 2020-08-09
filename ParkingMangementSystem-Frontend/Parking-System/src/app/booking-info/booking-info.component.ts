import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../service/customer.service';
import { Slots } from '../Models/slots.model';
import { Parking } from '../Models/parking.model';
import { BookSlot } from '../Models/bookslot.model';
import { UserModel } from '../Models/user.model';

@Component({
  selector: 'app-booking-info',
  templateUrl: './booking-info.component.html',
  styleUrls: ['./booking-info.component.css']
})
export class BookingInfoComponent implements OnInit {
  slot:Slots;
  park:Parking;
  book:BookSlot;
  user:UserModel;
  constructor(private route:ActivatedRoute,private router:Router,private service: CustomerService) {
    this.slot= new Slots();
    this.park=new Parking();
    this.book= new BookSlot();
    this.user=new UserModel();
    this.book.bookingId=parseInt(this.route.snapshot.paramMap.get("bookingId"));
   }

  ngOnInit() {
 
 }


 
}
