package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.Pelicula_DAO;
import modelo.Pelicula;

@Stateless
public class GestionPeliculas {

	@Inject
	private Pelicula_DAO peliculaDAO;
	
	public Pelicula obtenerPelicula(String nombre) {
		return peliculaDAO.obtenerPelicula(nombre);
	}
}
