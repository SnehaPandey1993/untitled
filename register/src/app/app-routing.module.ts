import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { SerachDeleteComponent } from './serach-delete/serach-delete.component';
import { DeploymentspecComponent } from './deploymentspec/deploymentspec.component'

const routes: Routes = [
  {path:"",redirectTo:"register",pathMatch:"full"},
   {path:"register",component:RegistrationComponent},
   {path:"search",component:SerachDeleteComponent},
   {path:"bom",component:DeploymentspecComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
