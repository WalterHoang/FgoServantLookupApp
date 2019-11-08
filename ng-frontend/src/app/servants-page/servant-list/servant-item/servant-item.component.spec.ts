import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServantItemComponent } from './servant-item.component';

describe('ServantItemComponent', () => {
  let component: ServantItemComponent;
  let fixture: ComponentFixture<ServantItemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServantItemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServantItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
