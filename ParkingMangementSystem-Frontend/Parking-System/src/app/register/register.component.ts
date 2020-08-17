import { Component, OnInit } from '@angular/core';
import { Login } from '../models/login.model';
import { UserService } from '../service/user.service';
import { UserModel } from '../Models/customer.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register', //// used for accessing the component
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user : UserModel;
  allUser : UserModel[]=[];
  flag : UserModel;
  exists : boolean=false;
  

  constructor(private userService : UserService, private route : Router) {
    this.user = new UserModel();
    this.flag = new UserModel();
   }

  ngOnInit() {
    this.user.role = 'customer' ;
    this.user.gender=null;
  }

  saveUser(){
    console.log(this.user);
      this.userService.registerUser(this.user).subscribe(data => {
        this.flag = data;
        console.log(this.flag);
        if(this.flag==null){
          alert("Username Exists!")
        }else{
          alert("Successfully Registered!")
        }
        this.route.navigate(['login'])
      })
  }

  
 
}
