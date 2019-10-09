import { NgModule } from '@angular/core';
import { LoginComponent } from './login.component';
import { SharedModule } from '../../shared/shared.module';
import { LoginService } from '../../service/login.service';
import { LoginRoutingModule } from './login-routing.module';

@NgModule({
  declarations: [LoginComponent],
  imports: [
    SharedModule,
    LoginRoutingModule
  ],
  providers: [ LoginService ]
})
export class LoginModule { }
