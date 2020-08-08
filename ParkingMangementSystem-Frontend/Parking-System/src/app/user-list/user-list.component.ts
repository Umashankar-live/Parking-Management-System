import { Component, OnInit } from '@angular/core';
import { Parking } from "../Models/parking.model";
import { UserService } from '../service/user.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  parking:Parking[];
  constructor(private service:UserService,private route:Router) { }

  ngOnInit() {
    setTimeout( ()=>{this.service.fetchAllParking().subscribe(response=>{
      this.parking= response;
    }) },100);
  }
 
  viewParking(park:Parking){
    this.route.navigate(['/customer/bookparking',park]);
   }

}
