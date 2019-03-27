import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


 

import { HomeComponent } from './home/home.component';
import { SigninComponent } from './signin/signin.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path: "home", component:HomeComponent},
  {path: "signin", component:SigninComponent  },
  {path: "login", component:LoginComponent},
  {path: "**", pathMatch:'full', redirectTo: 'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
