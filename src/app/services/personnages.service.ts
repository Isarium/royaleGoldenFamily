import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Personnage } from '../models/personnage';

@Injectable({
  providedIn: 'root'
})
export class PersonnagesService {

  readonly URL:  string = 'http://localhost:8080/personnage/'

  constructor(private httpClient: HttpClient) { }

  getAllPersonnages():Observable<Personnage[]> {
    return this.httpClient.get<Personnage[]>(this.URL);
  }

  getPersonnageById(id: number): Observable<Personnage> {
    return this.httpClient.get<Personnage>(this.URL + id);
  }

  addPersonnages(personnage: Personnage) {
    console.log(personnage);
    return this.httpClient.post(this.URL, personnage);
  }

  deletePersonnages(personnage: number) {
    return this.httpClient.delete(this.URL + personnage);
  }


}
