import { Injectable } from '@angular/core';
import { Parking } from "../Models/parking.model";
import {HttpClient} from '@angular/common/http';
import { Search } from '../Models/search.model';
import { Slots } from '../Models/slots.model';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  
  constructor(private http : HttpClient) { }

  fetchAllParking() {
    return this.http.get<Parking[]>("http://localhost:8035/parking/getAll");
  }

  findSlot(search:Search){
    return this.http.get<Slots[]>("http://localhost:8035/parking/all/location/"+search.location+"/"+search.type);
  }




}
