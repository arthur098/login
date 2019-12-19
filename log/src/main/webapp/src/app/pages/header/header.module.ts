import { NgModule } from '@angular/core';
import { SharedModule } from '../../shared/shared.module';
import { HeaderComponent } from './header.component';

@NgModule({
  declarations: [HeaderComponent],
  imports: [
    SharedModule
  ]
})
export class HeaderModule { }
