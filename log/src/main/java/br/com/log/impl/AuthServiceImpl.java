package br.com.log.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;

import br.com.log.business.AuthBO;
import br.com.log.dao.UsuarioDAO;
import br.com.log.entidade.Usuario;
import br.com.log.facade.AuthService;

public class AuthServiceImpl implements AuthService {

	@Inject
	private AuthBO bo = new AuthBO();

	@Inject
	private UsuarioDAO dao;

	@Override
	public Usuario autenticar(String usuario, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario registrar(Usuario usuario) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		return this.bo.registrar(usuario);
	}
}
