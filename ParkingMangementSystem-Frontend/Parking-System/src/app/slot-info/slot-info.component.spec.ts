import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SlotInfoComponent } from './slot-info.component';

describe('SlotInfoComponent', () => {
  let component: SlotInfoComponent;
  let fixture: ComponentFixture<SlotInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SlotInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SlotInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
