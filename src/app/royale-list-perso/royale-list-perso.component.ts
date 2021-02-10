import { Component, OnInit } from '@angular/core';
import { Personnage } from '../models/personnage';
import { PersonnagesService } from '../services/personnages.service';

@Component({
  selector: 'app-royale-list-perso',
  templateUrl: './royale-list-perso.component.html',
  styleUrls: ['./royale-list-perso.component.scss']
})
export class RoyaleListPersoComponent implements OnInit {

  personnages: Array<Personnage> = [];

  constructor(private personnageService: PersonnagesService) { }

  ngOnInit(): void {
    this.personnageService.getAllPersonnages().subscribe(data => {
      this.personnages = data;
      console.log(this.personnages);
    });
    
  }

}
