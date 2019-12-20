import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from '../about/about.component';
import { HomeComponent } from './home.component';

const routes: Routes = [
    {
      path: '',
      component: HomeComponent,
      children: [
        { path: 'about', component: AboutComponent },
        { path: 'login', loadChildren: () => import('../login/login.module').then(m => m.LoginModule) },
        { path: 'registrar', loadChildren: () => import('../registrar/registrar.module').then(m => m.RegistrarModule)}
      ]
  },
];

@NgModule({
  imports: [ RouterModule.forChild(routes) ],
  exports: [ RouterModule ]
})
export class HomeRoutingModule { }
