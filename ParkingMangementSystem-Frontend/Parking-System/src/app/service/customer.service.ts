import { Injectable } from '@angular/core';
import {Parking} from '../Models/parking.model';
import {HttpClient} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  
  constructor(private http : HttpClient) { }

  fetchAllParking() {
    return this.http.get<Parking[]>("http://localhost:8035/parking/getAll");
  }




}
