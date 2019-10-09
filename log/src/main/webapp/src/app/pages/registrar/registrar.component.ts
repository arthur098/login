import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/service/login.service';
import { FormGroup, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'log-registrar',
  templateUrl: './registrar.component.html',
  styleUrls: ['./registrar.component.scss']
})
export class RegistrarComponent implements OnInit {

  constructor(private loginService: LoginService) { }

  formulario: FormGroup;
  static initForm(): FormGroup {
    return new FormGroup({
      username: new FormControl(null, Validators.required),
      password: new FormControl(null, Validators.required),
      pessoa: new FormGroup({
        nome: new FormControl(null, Validators.required),
        sobrenome: new FormControl(null, Validators.required),
        cpfCnpj: new FormControl(null, Validators.required),
        sexo: new FormControl(null, Validators.required)
      })
    });
  }

  ngOnInit() {
    this.formulario = RegistrarComponent.initForm();
  }

  registrar() {
    if(this.formulario.valid) {
      this.loginService.registrar(this.formulario.value).subscribe(result => {
        console.log('usuario cadastrado com sucesso.')
      })
    }
  }
}
