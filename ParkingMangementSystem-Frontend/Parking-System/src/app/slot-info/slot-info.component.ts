import { Component, OnInit } from '@angular/core';
import { Slots } from '../Models/slots.model';
import { Parking } from '../Models/parking.model';
import { BookSlot } from '../Models/bookslot.model';
import { UserModel } from '../Models/user.model';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../service/customer.service';

@Component({
  selector: 'app-slot-info',
  templateUrl: './slot-info.component.html',
  styleUrls: ['./slot-info.component.css']
})
export class SlotInfoComponent implements OnInit {

  slot:Slots;
  park:Parking;
  book:BookSlot;
  user:UserModel;
  constructor(private route:ActivatedRoute,private router:Router,private service: CustomerService) { 
    this.slot= new Slots();
    this.park=new Parking();
    this.book= new BookSlot();
    this.user=new UserModel();
    this.slot.location=this.route.snapshot.paramMap.get("location");
    this.slot.type=parseInt(this.route.snapshot.paramMap.get("type"));
    // this.service.findSlot(this.slot).subscribe(response=>{this.slots=response});



  }

  ngOnInit() {
  }

  bookSlot(){
    this.book.totalPrice=0;
    this.book.totalPrice=this.book.hour*this.slot.price;
    this.service.bookSlot(this.slot,this.book).subscribe(x=>alert("Booked Successfully"));
    this.router.navigate(['/bookinginfo']);
  }


}
