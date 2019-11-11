import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './navigation/navigation.component';
import { ServantsPageComponent } from './servants-page/servants-page.component';
import { HomeComponent } from './home/home.component';
import { ServantDetailsComponent } from './servants-page/servant-details/servant-details.component';
import { ServantListComponent } from './servants-page/servant-list/servant-list.component';
import { ServantItemComponent } from './servants-page/servant-list/servant-item/servant-item.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
/**
 * This module contains all of the components needed to run this app
 */
@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    ServantsPageComponent,
    HomeComponent,
    ServantDetailsComponent,
    ServantListComponent,
    ServantItemComponent,
    PageNotFoundComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
