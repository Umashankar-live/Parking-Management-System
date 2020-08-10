import { Injectable } from '@angular/core';
import { Parking } from "../Models/parking.model";
import {HttpClient} from '@angular/common/http';
import { Search } from '../Models/search.model';
import { Slots } from '../Models/slots.model';
import { BookSlot } from '../Models/bookslot.model';



@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  userName : String ;
  
  constructor(private http : HttpClient) { }

  fetchAllParking() {
    return this.http.get<Parking[]>("http://localhost:8035/parking/getAll");
  }

  findSlot(slot:Slots){
    return this.http.get<Slots[]>("http://192.168.2.206:8035/parking/all/location/"+slot.location+"/"+slot.type);
  }

  bookSlot(slot:Slots,book:BookSlot){

    return this.http.post<BookSlot>("http://localhost:8039/booking/add/"+slot.slotId,book);

  }


  getBookingByName(bookingName: String){
    return this.http.get<BookSlot[]>("http://localhost:8039/booking/getbyName/"+bookingName);
    
  }
}
