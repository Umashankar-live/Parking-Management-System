import { Injectable } from '@angular/core';
import { UserModel } from '../Models/user.model';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class UserService {
  User : UserModel[]=[];
  constructor(private http : HttpClient) { }

  fetchAllUser(){
    return this.http.get<UserModel[]>("http://192.168.2.206:8034/User/getAllUsers");
  }

  registerUser(user: UserModel) {
    return this.http.post<UserModel>("http://192.168.2.206:8034/User/addUser", user);
  }




}