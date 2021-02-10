import { BrowserModule } from '@angular/platform-browser';
import { APP_BOOTSTRAP_LISTENER, NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AdminComponent } from './admin/admin.component';
import { ListPersoComponent } from './list-perso/list-perso.component';
import { RoyaleListPersoComponent } from './royale-list-perso/royale-list-perso.component';
import { AddPersonnageComponent } from './add-personnage/add-personnage.component';
import { DeleteUpdatePersonnageComponent } from './delete-update-personnage/delete-update-personnage.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    ContactComponent,
    AdminComponent,
    ListPersoComponent,
    RoyaleListPersoComponent,
    AddPersonnageComponent,
    DeleteUpdatePersonnageComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
