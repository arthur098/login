import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { RollTopButtonComponent } from './@core/roll-top-button/roll-top-button.component';
import { MaterialDesignModule } from './@core/material-design/material-design.module';

@NgModule({
  declarations: [
    AppComponent,
    RollTopButtonComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    MaterialDesignModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
