import { Injectable, Injector } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';

@Injectable()
export abstract class UtilTranslateComponent {
  _lang: string = 'pt-br';
  _langSupports: string[] = ['pt-br'];
  private translate: TranslateService;

  protected constructor(private injector: Injector) {
    this.translate = this.injector.get(TranslateService);
    this.translate.addLangs(this._langSupports);
    this.translate.setDefaultLang(this._lang);

    this.translate.use(this._lang);
  }
}
