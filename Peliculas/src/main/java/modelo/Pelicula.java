package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pelicula")
public class Pelicula {

	
	@Id
	@Column(name = "codigo_pelicula")
	private int codigo;
	
	@Column(name = "titulo_pelicula")
	private String titulo;
	
	@Column(name = "descripcion_pelicula")
	private String descripcion;
	
	@Column(name = "genero_pelicula")
	private String genero;
	
	@Column(name = "fecha_estreno_pelicula")
	private String fecha_estreno;
	
	@Column(name = "director_pelicula")
	private String director;
	
	@Column(name = "precio_pelicula")
	private String precio;
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFecha_estreno() {
		return fecha_estreno;
	}

	public void setFecha_estreno(String fecha_estreno) {
		this.fecha_estreno = fecha_estreno;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", descripcion=" + descripcion + ", genero="
				+ genero + ", fecha_estreno=" + fecha_estreno + ", director=" + director + ", precio=" + precio + "]";
	}
	
	
}
