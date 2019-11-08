import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ServantsPageComponent } from './servants-page/servants-page.component';
import { DamageCalculatorPageComponent } from './damage-calculator-page/damage-calculator-page.component';
import { HomeComponent } from './home/home.component';
import { ServantDetailsComponent } from './servants-page/servant-details/servant-details.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'servants', component: ServantsPageComponent, children: [
    {path: ':id', component: ServantDetailsComponent}
  ]},
  {path: 'damage-calculator', component: DamageCalculatorPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
