package servicios;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import modelo.Pelicula;
import negocio.GestionPeliculas;

@Path("/pelicula")
public class Pelicula_Service_Rest {

	@Inject
	private GestionPeliculas gp;
	
	@GET
	@Path("/datos")
	@Produces("application/json")
	public Respuesta getPelicula(@QueryParam("f") String nombre) {
		Pelicula p = gp.obtenerPelicula(nombre);
		Respuesta respuesta= new Respuesta();
		if(p !=null) {
			respuesta.setCodigo(1);
			respuesta.setMensaje("ok");
			respuesta.setPelicula(p);
		}else {
			respuesta.setCodigo(0);
			respuesta.setMensaje("No se encuentra la pelicula en nuestro catalogo");
			respuesta.setPelicula(p);
		}
		
		return respuesta;
	}
}
