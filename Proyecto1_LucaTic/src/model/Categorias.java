package model;

import utilidades.LecturaDatos;

/**
 * 
 * @author Sheila
 * 23/04/2019
 *
 */
public class Categorias {
	/**
	 * Se crea la clase categoría con los atributos idCcategorias y nombreCat para la identificación y el nombre respectivamente
	 */
	private int idcategorias;
	private String nombreCat;
	
	/**
	 * Getter y Setter
	 * @return
	 */
	public int getIdcategorias() {
		return idcategorias;
	}
	public void setIdcategorias(int idcategorias) {
		this.idcategorias = idcategorias;
	}
	public String getNombreCat() {
		return nombreCat;
	}
	public void setNombreCat(String nombreCat) {
		this.nombreCat = nombreCat;
	}
	/**
	 * To String
	 */
	@Override
	public String toString() {
		return "Categorias [idcategorias=" + idcategorias + ", nombreCat=" + nombreCat + "]";
	}
	
	/**
	 * Constructor vacío y con los parámetros
	 * @param idcategorias
	 * @param nombreCat
	 */
	public Categorias(int idcategorias, String nombreCat) {
		super();
		this.idcategorias = idcategorias;
		this.nombreCat = nombreCat;
	}
	public Categorias() {
		super();
	}
	
	public void crearCategoria() {
		System.out.println("El ID de la categoría se asignará de forma automática.");
		this.nombreCat = LecturaDatos.LeerTexto("Introduzca el nombre de la categoría");
	
}

}
