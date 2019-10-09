package br.com.log.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;

import br.com.log.bean.UserBean;
import br.com.log.business.AuthBO;
import br.com.log.entidade.Usuario;
import br.com.log.facade.AuthService;

public class AuthServiceImpl implements AuthService {

	@Inject
	private AuthBO bo;

	@Override
	public UserBean autenticar(String usuario, String senha) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		return this.bo.autenticar(usuario, senha);
	}

	@Override
	public Usuario registrar(Usuario usuario) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		return this.bo.registrar(usuario);
	}
}
