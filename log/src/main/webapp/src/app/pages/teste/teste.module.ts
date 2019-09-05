import { NgModule } from '@angular/core';
import { TesteComponent } from './teste.component';
import { SharedModule } from 'src/app/shared/shared.module';
import { TesteRoutingModule } from './teste-routing.module';

@NgModule({
  imports: [
    SharedModule,
    TesteRoutingModule
  ],
  declarations: [TesteComponent]
})
export class TesteModule { }
