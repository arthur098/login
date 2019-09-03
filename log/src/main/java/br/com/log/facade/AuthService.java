package br.com.log.facade;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import br.com.log.entidade.Usuario;

public interface AuthService {
	Usuario autenticar(String usuario, String senha) throws UnsupportedEncodingException, NoSuchAlgorithmException;

	Usuario registrar(Usuario usuario) throws NoSuchAlgorithmException, UnsupportedEncodingException;
}
