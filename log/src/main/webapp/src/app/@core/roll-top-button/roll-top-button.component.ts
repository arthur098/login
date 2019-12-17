import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'log-roll-top-button',
  templateUrl: './roll-top-button.component.html',
  styleUrls: ['./roll-top-button.component.scss']
})
export class RollTopButtonComponent implements OnInit {
  ngOnInit() {
    window.addEventListener('scroll', (event: Event) => {
      if(event.target) {

      }
    })
  }
}
