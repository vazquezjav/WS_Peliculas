package datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Pelicula;

@Stateless
public class Pelicula_DAO {

	@Inject
	private EntityManager em;
	
	public Pelicula obtenerPelicula(String nombre) {
		try {
			String jpql = "SELECT p FROM Pelicula p WHERE titulo_pelicula LIKE ?1";
			Query q = em.createQuery(jpql, Pelicula.class);
			q.setParameter(1, nombre);
			Pelicula p = (Pelicula) q.getSingleResult();
			return p;
		} catch (Exception e) {
			return null;
		}
	}
}
