import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ServantsPageComponent } from './servants-page/servants-page.component';
import { HomeComponent } from './home/home.component';
import { ServantDetailsComponent } from './servants-page/servant-details/servant-details.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

/**
 * This module contains all of the routes
 * that are used in this app
 */
const routes: Routes = [
  {path: '', component: HomeComponent, pathMatch: 'full'},
  {path: 'servants', component: ServantsPageComponent, children: [
    {path: ':id', component: ServantDetailsComponent}
  ]},
  {path: 'not-found', component: PageNotFoundComponent},
  {path: '**', redirectTo: '/not-found'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
