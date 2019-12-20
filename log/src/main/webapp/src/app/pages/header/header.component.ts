import { Component, Injector } from '@angular/core';
import { UtilTranslateComponent } from 'src/app/@core/utils/util-translate.component';

@Component({
  selector: 'log-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent extends UtilTranslateComponent {

  constructor(injector: Injector) {
    super(injector);
  }
}
