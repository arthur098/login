package br.com.log.business;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.inject.Inject;

import br.com.log.bean.UserBean;
import br.com.log.dao.PessoaDAO;
import br.com.log.dao.UsuarioDAO;
import br.com.log.entidade.Usuario;
import br.com.log.util.DigestUtil;
import br.com.log.util.RandomUtil;

public class AuthBO {

	@Inject
	private UsuarioDAO dao;
	
	@Inject
	private PessoaDAO pessoaDAO;

	public Usuario registrar(Usuario usuario) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String salt = RandomUtil.randomString(20);

		String senhaSalted = usuario.getPassword() + salt;
		
		if(this.dao.getUsuarioByUsername(usuario.getUsername()) != null) {
			return null;
		}
		
		if(usuario.getPessoa() != null) {
			this.pessoaDAO.salvar(usuario.getPessoa());
		}

		usuario.setPassword(senhaSalted);
		
		usuario.setSaltPassword(salt);
		usuario.setPassword(DigestUtil.encrypt(senhaSalted));
		
		return this.dao.registrar(usuario);
	}
	
	public UserBean autenticar(String username, String senha) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		Usuario usuario = this.dao.getUsuarioByUsername(username);
		UserBean user = null;
		
		if(usuario != null) {
			String senhaSaltedEncrypted = DigestUtil.encrypt(senha + usuario.getSaltPassword());
			
			usuario = this.dao.autentica(usuario.getUsername(), senhaSaltedEncrypted);
			
			if(usuario != null) {
				byte[] baseUsuarioSenha = usuario.getUsername().concat(";").concat(usuario.getPassword()).getBytes();
				String base = Base64.getEncoder().encodeToString(baseUsuarioSenha);
				
				user = new UserBean(usuario.getPessoa() != null ? usuario.getPessoa().getNome() : "", usuario.getPessoa() != null ? usuario.getPessoa().getSobrenome() : "", base);
			}
				
		}
	
		return user;
	}

}
