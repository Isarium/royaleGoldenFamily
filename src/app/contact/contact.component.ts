import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.scss']
})
export class ContactComponent implements OnInit {
contactFomr = this.fb.group({
  firstname:[''],
  lastname:[''],
  mail:[''],
  sujet:[''],
  message:['']
})

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
  }

}
