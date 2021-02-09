import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteUpdatePersonnageComponent } from './delete-update-personnage.component';

describe('DeleteUpdatePersonnageComponent', () => {
  let component: DeleteUpdatePersonnageComponent;
  let fixture: ComponentFixture<DeleteUpdatePersonnageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeleteUpdatePersonnageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteUpdatePersonnageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
