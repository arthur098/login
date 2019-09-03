package br.com.log.business;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import br.com.log.dao.UsuarioDAO;
import br.com.log.entidade.Usuario;
import br.com.log.util.DigestUtil;
import br.com.log.util.RandomUtil;

public class AuthBO {

	private UsuarioDAO dao;

	public Usuario registrar(Usuario usuario) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		this.dao = new UsuarioDAO();
		String salt = RandomUtil.randomString(20);

		String senhaSalted = usuario.getPassword() + salt;

		usuario.setPassword(senhaSalted);
		
		usuario.setSaltPassword(salt);
		usuario.setPassword(DigestUtil.encrypt(senhaSalted));

		return null;
	}

}
