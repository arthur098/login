import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AuthGuard } from '../guards/auth.guard';

const routes: Routes = [
    { path: '', redirectTo: 'teste', pathMatch: 'full' },
    { path: 'teste', loadChildren: () => import('./teste/teste.module').then(m => m.TesteModule)},
    { path: 'about', component: AboutComponent, canActivate: [ AuthGuard ]},
    { path: 'login', loadChildren: () => import('./login/login.module').then(m => m.LoginModule)},
    { path: 'registrar', loadChildren: () => import('./registrar/registrar.module').then(m => m.RegistrarModule)}
];

@NgModule({
   imports: [RouterModule.forChild(routes)],
   exports: [RouterModule]
})
export class PagesRoutingModule { }
