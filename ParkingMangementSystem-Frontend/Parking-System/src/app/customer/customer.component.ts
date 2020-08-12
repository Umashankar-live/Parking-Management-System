import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {AuthService} from '../service/auth.service'
@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
bname : String ;
  constructor(private route : Router,private authService : AuthService) { }

  ngOnInit() {
    this.bname= sessionStorage.getItem('userName')
  }

  clickOnBook(){
    this.route.navigate(['bookparking']);
  }

  clickOnBookInfo(){
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
