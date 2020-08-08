import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListParkingComponent } from './list-parking.component';

describe('ListParkingComponent', () => {
  let component: ListParkingComponent;
  let fixture: ComponentFixture<ListParkingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListParkingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListParkingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
