import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServantsPageComponent } from './servants-page.component';

describe('ServantsPageComponent', () => {
  let component: ServantsPageComponent;
  let fixture: ComponentFixture<ServantsPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServantsPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServantsPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
