import { Component, OnInit } from '@angular/core';
import { Slots } from '../Models/slots.model';
import { Parking } from '../Models/parking.model';
import { BookSlot } from '../Models/bookslot.model';
import { UserModel } from '../Models/customer.model';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../service/customer.service';
import { NgForm } from '@angular/forms';
import { AuthService } from '../service/auth.service';
import { formatDate } from '@angular/common';


@Component({
  selector: 'app-slot-info',
  templateUrl: './slot-info.component.html',
  styleUrls: ['./slot-info.component.css']
})
export class SlotInfoComponent implements OnInit {

  slot: Slots;
  park: Parking;
  book: BookSlot;
  user: UserModel;
  bname : String ;
  
  constructor(private route: ActivatedRoute, private router: Router, private service: CustomerService,private authService : AuthService) {

    this.slot = new Slots();
    this.park = new Parking();
    this.book = new BookSlot();
    this.user = new UserModel();
    this.slot.location = this.route.snapshot.paramMap.get("location");
    this.slot.type = parseInt(this.route.snapshot.paramMap.get("type"));
    this.slot.price = parseInt(this.route.snapshot.paramMap.get("price"));
    this.slot.slotId = parseInt(this.route.snapshot.paramMap.get("slotId"));



  }

  ngOnInit() {
   
    
  }


  bookSlot(form: NgForm) {
    console.log(sessionStorage.getItem('userName'))
    this.book.userName = sessionStorage.getItem('userName');
    this.book.totalPrice = 0;
    this.book.location = this.slot.location;
    this.book.type = this.slot.type;
    this.book.slotNo = this.slot.slotId;
    this.book.totalPrice = this.book.hour * this.slot.price;
    this.bname = this.book.userName
    this.service.bookSlot(this.slot, this.book).subscribe(x => {
      console.log(this.book);
      alert("Booked Successfully")
      this.router.navigate(['/bookinginfo',this.bname]);
      
    });
    

  }

  clickOnBook(){
    this.router.navigate(['bookparking']);
  }

  clickOnBookInfo(){
    this.router.navigate(['bookinginfo',this.bname]);
  }

  clickOnregister(){
    this.router.navigate(['userlist']);
  }

  logout(){
    sessionStorage.clear();
    this.authService.setLoggedIn(false);
    this.router.navigate(['login']);

  }


}
