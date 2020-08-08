import { Injectable } from '@angular/core';
import { Parking } from "../Models/parking.model";
import { HttpClient } from '@angular/common/http';


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

  
  
  






}
