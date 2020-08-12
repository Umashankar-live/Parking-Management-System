import { Component, OnInit } from '@angular/core';
import { Parking } from "../Models/parking.model";
import {CustomerService} from '../service/customer.service';
import {Router} from '@angular/router';
import { Slots } from '../Models/slots.model';
import {AuthService} from '../service/auth.service'

@Component({
  selector: 'app-book-parking',
  templateUrl: './book-parking.component.html',
  styleUrls: ['./book-parking.component.css']
})
export class BookParkingComponent implements OnInit {
  slot:Slots
  parking : Parking[]=[] ;

  slotList:Slots[]=[];
  
  bname: String;

  constructor(private service : CustomerService, private route : Router,private authService : AuthService) { }

  ngOnInit() {
    this.slot = new Slots();
    this.slot.location = null ;
    
  }


  searchSlot(){
    this.route.navigate(['/list-slot',this.slot.location,this.slot.type]);

    }


    clickOnBook(){
      this.route.navigate(['list-booking']);
    }
  
    clickOnBookInfo(){
      this.bname= sessionStorage.getItem('userName')
        this.route.navigate(['bookinginfo',this.bname]);
      }
      
    clickOnregister(){
      this.route.navigate(['userlist']);
    }
  
    logout(){
      sessionStorage.clear();
      this.authService.setLoggedIn(false);
      this.route.navigate(['login']);

    }
  
  
  }


