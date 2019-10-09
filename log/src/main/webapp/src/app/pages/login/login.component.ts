import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/service/login.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'log-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  constructor(private loginService: LoginService) { }

  formulario: FormGroup;

  static initForm(): FormGroup {
    return new FormGroup({
      usuario: new FormControl(null, Validators.required),
      senha: new FormControl(null, Validators.required)
    });
  }

  ngOnInit() {
    this.formulario = LoginComponent.initForm();
  }

  logar() {
    if(this.formulario.valid) {
      this.loginService.login(this.formulario.value.usuario, this.formulario.value.senha).subscribe(result => {
        localStorage.setItem('token', result.token);
        localStorage.setItem('nome', result.nome);
        localStorage.setItem('sobrenome', result.sobrenome);
      })
    }
  }
}
