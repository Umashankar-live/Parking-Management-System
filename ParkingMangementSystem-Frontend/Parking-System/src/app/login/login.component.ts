import { Component, OnInit } from '@angular/core';
import { Login } from '../models/login.model';
import { Router } from '@angular/router';
import { LoginService } from '../service/login.service';
import { UserModel } from '../Models/customer.model';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-login', //// used for accessing the component
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  login: Login;
  User: UserModel;
  id: String;

  constructor(private route: Router, private loginservice: LoginService, private Auth: AuthService) {
    this.login = new Login();
    this.User = new UserModel();
  }

  ngOnInit() {

  }



  checkRole(user: UserModel) {

    if (user == null) {
      alert("Invalid Username and Password");
    }

    //localStorage.setItem('user',this.employee.employeeId);
    sessionStorage.setItem('user', this.User.userId);
    sessionStorage.setItem('userName', this.User.userName);
    console.log(sessionStorage.getItem('userName'))
    console.log(user.role);

    if (user.role == "admin") {
      this.route.navigate(['admin']);
      this.Auth.setLoggedIn(true);
    } else if (user.role == "customer") {
      this.route.navigate(['customer']);
      this.Auth.setLoggedIn(true);

    } else {
      alert("You are not registered!")
    }
  }


  checkLogin() {
    console.log(this.login);
    this.loginservice.getUser(this.login).subscribe(data => {
      this.User = data;
      this.checkRole(this.User);
    });
  }


}


