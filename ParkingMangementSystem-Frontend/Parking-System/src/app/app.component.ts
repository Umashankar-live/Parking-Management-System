import { Component } from '@angular/core';
import { Router } from '@angular/router';
import {AuthService} from '../app/service/auth.service'

@Component({
  selector: 'app-root', // used for accessing the component
  templateUrl: './app.component.html', //contains HTML of the component
  styleUrls: ['./app.component.css'] // contains component-specific stylesheets
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
