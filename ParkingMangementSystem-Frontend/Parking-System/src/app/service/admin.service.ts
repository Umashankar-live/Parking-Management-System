import { Injectable } from '@angular/core';
import { Parking } from "../Models/parking.model";
import { HttpClient } from '@angular/common/http';
import { BookSlot } from '../Models/bookslot.model';

/* To define a class as a service in Angular, use the @Injectable() decorator to provide the metadata 
that allows Angular to inject it into a component as a dependency. */
@Injectable({
  providedIn: 'root'
})
export class AdminService {
  
  constructor(private http: HttpClient) { }

  addParking(parking: Parking) {
    return this.http.post<Parking>("http://localhost:8035/parking/add",parking);
  }

  fetchAllParking() {
    return this.http.get<Parking[]>("http://localhost:8035/parking/getAll");
  }

  deleteParking(index: number) {
    return this.http.delete("http://localhost:8035/parking/all/delete/"+index);
  }

  fetchAllBooking() {
    return this.http.get<BookSlot[]>("http://localhost:8039/booking/get");
  }

  
  deleteBooking(index: number) {
    return this.http.delete("http://localhost:8039/booking/delete/"+index);
  }
  
 

  
  
  






}
