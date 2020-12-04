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
	public Pelicula getPelicula(@QueryParam("f") String nombre) {
		Pelicula p = gp.obtenerPelicula(nombre);
		return p;
	}
}
