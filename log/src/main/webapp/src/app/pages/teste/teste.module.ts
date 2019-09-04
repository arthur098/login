import { NgModule } from '@angular/core';
import { TesteComponent } from './teste.component';
import { SharedModule } from 'src/app/shared/shared.module';

@NgModule({
  imports: [
    SharedModule
  ],
  declarations: [TesteComponent]
})
export class TesteModule { }
