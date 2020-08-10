import { Component } from '@angular/core';
import { Router } from '@angular/router';
import {AuthService} from '../app/service/auth.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Parking Management System';
  flag:boolean=false;
  
  
  
  constructor(private route: Router , private service : AuthService){
    if(sessionStorage.getItem('user')!=null){
      this.flag=true;
    }
  }

  ngOnInit() {
    
    
  }

  logout(){
    sessionStorage.clear();
    this.route.navigate(['login']);
  }

  
 
}
