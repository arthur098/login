package br.com.log.business;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;

import br.com.log.dao.UsuarioDAO;
import br.com.log.entidade.Usuario;
import br.com.log.util.DigestUtil;
import br.com.log.util.RandomUtil;

public class AuthBO {

	@Inject
	private UsuarioDAO dao;

	public Usuario registrar(Usuario usuario) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String salt = RandomUtil.randomString(20);

		String senhaSalted = usuario.getPassword() + salt;

		usuario.setPassword(senhaSalted);
		
		usuario.setSaltPassword(salt);
		usuario.setPassword(DigestUtil.encrypt(senhaSalted));
		
		return this.dao.registrar(usuario);
	}
	
	public Usuario autenticar(String username, String senha) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		Usuario usuario = this.dao.getUsuarioByUsername(username);
		
		if(usuario != null) {
			String senhaSaltedEncrypted = DigestUtil.encrypt(senha + usuario.getSaltPassword());
			
			usuario = this.dao.autentica(usuario.getUsername(), senhaSaltedEncrypted);
		}
		
		return usuario;
	}

}
