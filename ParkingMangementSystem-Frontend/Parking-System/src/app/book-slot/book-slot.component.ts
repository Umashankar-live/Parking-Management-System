import { Component, OnInit } from '@angular/core';
import {Parking} from '../Models/parking.model';
import {CustomerService} from '../service/customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-book-slot',
  templateUrl: './book-slot.component.html',
  styleUrls: ['./book-slot.component.css']
})
export class BookSlotComponent implements OnInit {
 ParkingList : Parking[]=[] ;
  constructor(private service : CustomerService, private route : Router) { }

  ngOnInit() {
    
    setTimeout(() => { this.reloadData()},100) ;

  }
  reloadData() {
    this.service.fetchAllParking().subscribe(data => {
      this.ParkingList = data ;
      console.log(this.ParkingList);
    })
  }

}
