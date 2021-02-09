import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoyaleListPersoComponent } from './royale-list-perso.component';

describe('RoyaleListPersoComponent', () => {
  let component: RoyaleListPersoComponent;
  let fixture: ComponentFixture<RoyaleListPersoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RoyaleListPersoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RoyaleListPersoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
