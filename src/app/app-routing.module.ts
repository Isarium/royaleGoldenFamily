import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { ContactComponent } from './contact/contact.component';
import { DeleteUpdatePersonnageComponent } from './delete-update-personnage/delete-update-personnage.component';
import { HomeComponent } from './home/home.component';
import { RoyaleListPersoComponent } from './royale-list-perso/royale-list-perso.component';

const routes: Routes = [
  { path:'', component: HomeComponent },
  { path:'see', component: RoyaleListPersoComponent },
  { path:'contact', component: ContactComponent },
  { path:'admin', component: AdminComponent },
  { path:'maj', component:DeleteUpdatePersonnageComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
