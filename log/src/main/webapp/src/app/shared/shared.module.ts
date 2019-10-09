import { NgModule } from '@angular/core';
import { MaterialDesignModule } from '../@core/material-design/material-design.module';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  imports: [
    MaterialDesignModule,
    ReactiveFormsModule
  ],
  exports: [
    MaterialDesignModule,
    ReactiveFormsModule
  ]
})
export class SharedModule { }
