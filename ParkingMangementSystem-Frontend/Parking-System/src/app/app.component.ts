import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../app/service/auth.service'



@Component({
  selector: 'app-root', // used for accessing the component
  templateUrl: './app.component.html', //contains HTML of the component
  styleUrls: ['./app.component.css'] // contains component-specific stylesheets
})
export class AppComponent {
  title = 'Parking Express Pvt Ltd';
  
  
  constructor(private router: Router, private service: AuthService) {
  }


  ngOnInit() {


  }

  logout() {
    sessionStorage.clear();
    this.router.navigate(['login']);
  }



}
