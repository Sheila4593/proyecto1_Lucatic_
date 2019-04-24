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
	 * Se crea la clase categor�a con los atributos idCcategorias y nombreCat para la identificaci�n y el nombre respectivamente
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
	 * Constructor vac�o y con los par�metros
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
		System.out.println("El ID de la categor�a se asignar� de forma autom�tica.");
		this.nombreCat = LecturaDatos.LeerTexto("Introduzca el nombre de la categor�a");
	
}

}
