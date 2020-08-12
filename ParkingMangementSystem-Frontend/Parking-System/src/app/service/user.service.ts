import { Injectable } from '@angular/core';
import { UserModel } from '../Models/customer.model';
import {HttpClient} from '@angular/common/http'
import { Parking } from "../Models/parking.model";

@Injectable({
  providedIn: 'root'
})
export class UserService {
  User : UserModel[]=[];
  constructor(private http : HttpClient) { }

  fetchAllUser(){
    return this.http.get<UserModel[]>("http://localhost:8034/User/getAllUsers");
  }

  registerUser(user: UserModel) {
    return this.http.post<UserModel>("http://localhost:8034/User/addUser", user);
  }


  fetchAllParking(){
    return this.http.get<Parking[]>("http://localhost:8035/parking/getAll");
  }




}
