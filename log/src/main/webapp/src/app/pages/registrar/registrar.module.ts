import { NgModule } from '@angular/core';
import { RegistrarComponent } from './registrar.component';
import { SharedModule } from 'src/app/shared/shared.module';
import { LoginService } from 'src/app/service/login.service';
import { RegistrarRoutingModule } from './registrar-routing.module';



@NgModule({
  declarations: [RegistrarComponent],
  imports: [
    SharedModule,
    RegistrarRoutingModule
  ],
  providers: [ LoginService ]
})
export class RegistrarModule { }
