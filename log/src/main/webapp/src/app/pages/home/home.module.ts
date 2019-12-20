import { NgModule } from '@angular/core';
import { HomeComponent } from './home.component';
import { SharedModule } from '../../shared/shared.module';
import { RollTopButtonComponent } from '../../@core/roll-top-button/roll-top-button.component';
import { HeaderComponent } from '../header/header.component';
import { HomeRoutingModule } from './home-routing.module';
import { AboutComponent } from '../about/about.component';

@NgModule({
  declarations: [ HomeComponent, RollTopButtonComponent, HeaderComponent, AboutComponent ],
  imports: [
    SharedModule,
    HomeRoutingModule
  ]
})
export class HomeModule { }
