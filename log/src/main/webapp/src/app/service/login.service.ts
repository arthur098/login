import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { UserModel } from '../pages/models/user.model';

@Injectable()
export class  LoginService {
  constructor(private _http: HttpClient) {}

  login(usuario: string, senha: string): Observable<UserModel> {
    return this._http.get(`${environment.URL_SERVER}/access-control?usuario=${usuario}&senha=${senha}`).pipe(map((res: UserModel)  => res));
  }

  registrar(usuario: any): Observable<Object> {
    return this._http.post(`${environment.URL_SERVER}/access-control/registrar`, usuario).pipe(map((res) => res));
  }
}
