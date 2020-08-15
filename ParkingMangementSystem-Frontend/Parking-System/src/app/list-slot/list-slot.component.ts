import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from '../service/customer.service';
import { Slots } from '../Models/slots.model';
@Component({
  selector: 'app-list-slot',
  templateUrl: './list-slot.component.html',
  styleUrls: ['./list-slot.component.css']
})
export class ListSlotComponent implements OnInit {
location : String ;
type : number ;
slotList : Slots[] = [];
slots : Slots ;
page: number = 1;

  constructor(private route:ActivatedRoute,private router:Router,private service: CustomerService) { }

  ngOnInit() {
    this.route.params.subscribe(x=>this.location=x['loc']);
    this.route.params.subscribe(y =>this.type=y['typ']);
    this.service.findSlot(this.location,this.type).subscribe(response=>
      {console.log(response);
        this.slotList=response;
        console.log(this.slotList.length)
        if (this.slotList.length == 0) {
          alert("No Slots Available for this Location ");
          this.router.navigate(['customer']);
        }
      }) 
  }

  bookSlot(slots:Slots){
    this.router.navigate(['/slot',slots]);
   }

}
