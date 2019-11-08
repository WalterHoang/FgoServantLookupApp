import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DamageCalculatorPageComponent } from './damage-calculator-page.component';

describe('DamageCalculatorPageComponent', () => {
  let component: DamageCalculatorPageComponent;
  let fixture: ComponentFixture<DamageCalculatorPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DamageCalculatorPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DamageCalculatorPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
