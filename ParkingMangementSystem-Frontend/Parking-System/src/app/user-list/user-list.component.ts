import { Component, OnInit } from '@angular/core';
import { Parking } from "../Models/parking.model";
import { UserService } from '../service/user.service';
import { Router } from '@angular/router';
import { AuthService } from '../service/auth.service';
@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  parking:Parking[]=[];
  bname : String ;
  park : Parking

  constructor(private service:UserService,private route:Router,private authService : AuthService) { }

  ngOnInit() {
    setTimeout( ()=>{this.service.fetchAllParking().subscribe(response=>{
      this.parking= response;
    }) },100);
  }
 
  viewParking(park:Parking){
    this.route.navigate(['bookparking']);
   }

   clickOnBook(){
    this.route.navigate(['bookparking']);
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
