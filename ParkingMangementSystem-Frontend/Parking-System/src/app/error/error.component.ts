import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';
import { AuthService } from '../service/auth.service'

@Component({
  selector: 'app-error',
  templateUrl: './error.component.html',
  styleUrls: ['./error.component.css']
})
export class ErrorComponent implements OnInit {
  errMsg: string;


  constructor(private router: Router, private authService: AuthService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(x => this.errMsg = x['errMsg']);
    console.log(this.errMsg);
  }


  logout() {
    sessionStorage.clear();
    this.authService.setLoggedIn(false);
    this.router.navigate(['login']);

  }

}
