import { Component, OnInit } from '@angular/core';
import { Personnage } from '../models/personnage';
import { PersonnagesService } from '../services/personnages.service';

@Component({
  selector: 'app-delete-update-personnage',
  templateUrl: './delete-update-personnage.component.html',
  styleUrls: ['./delete-update-personnage.component.scss']
})
export class DeleteUpdatePersonnageComponent implements OnInit {


  personnageNew: Personnage;
  personnages: Array<Personnage> = [];

  constructor(private personnageService: PersonnagesService) { }

  ngOnInit(): void {

    this.refreshPersonnageList();


    this.personnageNew = new Personnage();
  }

  deletePersonnage(id: number) {
    this.personnageService.deletePersonnages(id).subscribe(data => {
      this.refreshPersonnageList();
    }, error => console.log('erreur'));

  }

  addPersonnage() {
    this.personnageService.addPersonnages(this.personnageNew).subscribe(data => {
      this.refreshPersonnageList();
    }, error => console.log('erreur'));

  }

  refreshPersonnageList() {
    this.personnageService.getAllPersonnages().subscribe(data => {
      this.personnages = data;
      console.log(this.personnages);
    });
  }


}
