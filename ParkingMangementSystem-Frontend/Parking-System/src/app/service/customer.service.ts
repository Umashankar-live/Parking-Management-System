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

  
  constructor(private http : HttpClient) { }

  fetchAllParking() {
    return this.http.get<Parking[]>("http://localhost:8035/parking/getAll");
  }

  findSlot(location : String ,type : Number){
    return this.http.get<Slots[]>("http://localhost:8035/parking/all/location/"+location+"/"+type);
  }

  bookSlot(slot:Slots,book:BookSlot){

    return this.http.post<BookSlot>("http://localhost:8039/booking/add/"+slot.slotId,book);

  }


  getBookingByName(bookingName: String){
    return this.http.get<BookSlot[]>("http://localhost:8039/booking/getbyName/"+bookingName);
    
  }

 
}
