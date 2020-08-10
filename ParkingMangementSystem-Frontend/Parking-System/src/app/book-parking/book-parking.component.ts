import { Component, OnInit } from '@angular/core';
import { Parking } from "../Models/parking.model";
import {CustomerService} from '../service/customer.service';
import {Router} from '@angular/router';
import { Slots } from '../Models/slots.model';

@Component({
  selector: 'app-book-parking',
  templateUrl: './book-parking.component.html',
  styleUrls: ['./book-parking.component.css']
})
export class BookParkingComponent implements OnInit {
  slot:Slots
  parking : Parking[]=[] ;

  slots:Slots[]=[];

  
  bname: String;

  constructor(private service : CustomerService, private route : Router) { }

  ngOnInit() {
    this.slot = new Slots();
    
  }


  searchSlot(){
   
    this.service.findSlot(this.slot).subscribe(response=>{this.slots=response;})
  
    }

// <<<<<<< HEAD

//     bookSlot(slots:Slots){
//      this.route.navigate(['/slot',slots]);
//     // bookSlot(sid:number ,loc : String ,typ : number ,pri : number){
//     //  this.route.navigate(['/slot',sid,loc,typ,pri]);
// =======
    bookSlot(slots:Slots){
     this.route.navigate(['/slot',slots]);
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
      this.route.navigate(['login']);

    }
  
  
  }


