package br.com.log.rest.resources;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.log.bean.UserBean;
import br.com.log.entidade.Usuario;
import br.com.log.facade.AuthService;

@Path("access-control")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InitialResource {

	@Inject
	private AuthService service;

	@GET
	public Response login(@QueryParam("usuario") String usuario, @QueryParam("senha") String senha)
			throws UnsupportedEncodingException, NoSuchAlgorithmException {
		UserBean user = this.service.autenticar(usuario, senha);
		Response.ResponseBuilder builder;

		if (user == null) {
			builder = Response.status(Response.Status.UNAUTHORIZED);
		} else {
			builder = Response.ok(user);
		}

		return builder.build();
	}

	@POST
	@Path("registrar")
	public Response registrar(Usuario usuario) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		Response.ResponseBuilder builder;
		Usuario user = this.service.registrar(usuario);

		if (user == null) {
			builder = Response.status(Response.Status.CONFLICT);
		} else {
			builder = Response.ok(user);
		}

		return builder.build();
	}
}
