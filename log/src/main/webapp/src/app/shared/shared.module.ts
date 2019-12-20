import { NgModule } from '@angular/core';
import { MaterialDesignModule } from '../@core/material-design/material-design.module';
import { ReactiveFormsModule } from '@angular/forms';
import { TranslateModule, TranslateLoader } from '@ngx-translate/core';
import { TranslateLoaderConfigFactory } from '../@core/utils/app.translate-loader-config.factory';
import { HttpClient } from '@angular/common/http';

@NgModule({
  imports: [
    MaterialDesignModule,
    ReactiveFormsModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: TranslateLoaderConfigFactory,
        deps: [HttpClient]
      }
    })
  ],
  exports: [
    MaterialDesignModule,
    ReactiveFormsModule,
    TranslateModule
  ]
})
export class SharedModule { }
