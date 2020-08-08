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
  constructor(private service : CustomerService, private route : Router) { }

  ngOnInit() {
<<<<<<< HEAD
    this.slot = new Slots();
=======
    this.slot= new Slots;
>>>>>>> 07c5934e86432d787a11bc8741c118e5c82af1ea
    
  }


  searchSlot(){
   
    this.service.findSlot(this.slot).subscribe(response=>{this.slots=response;})
  
    }

    bookSlot(slot:Slots){
     this.route.navigate(['/slot',slot]);
    }
  
  
  }


