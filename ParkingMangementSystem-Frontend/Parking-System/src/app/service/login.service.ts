import { Injectable } from '@angular/core';
import { Login } from '../Models/login.model';
import { HttpClient } from '@angular/common/http';
import { UserModel } from '../Models/customer.model';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  loginList : Login[] =[]
  

  constructor(public http : HttpClient) {
    }

   getUser(login : Login){
     console.log(login);
     return this.http.post<UserModel>("http://localhost:8037/login/validate",login);
   }
}
