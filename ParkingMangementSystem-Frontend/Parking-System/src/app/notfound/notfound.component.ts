import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../service/auth.service'


@Component({
  selector: 'app-notfound',
  templateUrl: './notfound.component.html',
  styleUrls: ['./notfound.component.css']
})
export class NotFoundComponent implements OnInit {
 

  constructor(private router: Router, private authService: AuthService) { }

  ngOnInit() {

   
  }


  logout() {
    sessionStorage.clear();
    this.authService.setLoggedIn(false);
    this.router.navigate(['login']);

  }

}
