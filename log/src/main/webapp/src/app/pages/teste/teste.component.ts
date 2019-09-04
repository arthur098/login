import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'log-teste',
  templateUrl: './teste.component.html',
  styleUrls: ['./teste.component.scss']
})
export class TesteComponent implements OnInit {
  ngOnInit(): void {
    throw new Error("Method not implemented.");
  }

}
