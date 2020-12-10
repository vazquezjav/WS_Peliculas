package servicios;

import modelo.Pelicula;

public class Respuesta {

	private int codigo;
	private String mensaje;
	private Pelicula pelicula;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	@Override
	public String toString() {
		return "Respuesta [codigo=" + codigo + ", mensaje=" + mensaje + ", pelicula=" + pelicula + "]";
	}
	
	
}
