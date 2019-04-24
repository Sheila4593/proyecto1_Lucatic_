package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import datos.ConexionBBDD;
import datos.DatosCat;
import utilidades.LecturaDatos;

public class Peliculas {
	private String nombrePel;
	private int anioEstreno;
	private String nombreCat;
	private int idPeliculas;
	private int visualizaciones;
	private int valoraciones;
	

	public int getValoraciones() {
		return valoraciones;
	}
	public void setValoraciones(int valoraciones) {
		this.valoraciones = valoraciones;
	}
	public int getVisualizaciones() {
		return visualizaciones;
	}
	public void setVisualizaciones(int visualizaciones) {
		this.visualizaciones = visualizaciones;
	}
	public static Logger getLog() {
		return log;
	}
	public String getNombrePel() {
		return nombrePel;
	}
	public void setNombrePel(String nombrePel) {
		this.nombrePel = nombrePel;
	}
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	public String getNombreCat() {
		return nombreCat;
	}
	public void setNombreCat(String nombreCat) {
		this.nombreCat = nombreCat;
	}
	public int getIdPeliculas() {
		return idPeliculas;
	}
	public void setIdPeliculas(int idPeliculas) {
		this.idPeliculas = idPeliculas;
	}
	@Override
	public String toString() {
		return "Peliculas [nombrePel=" + nombrePel + ", anioEstreno=" + anioEstreno + ", nombreCat=" + nombreCat
				+ ", idPeliculas=" + idPeliculas + "]";
	}
	public Peliculas(String nombrePel, int anioEstreno, String nombreCat, int idPeliculas) {
		super();
		this.nombrePel = nombrePel;
		this.anioEstreno = anioEstreno;
		this.nombreCat = nombreCat;
		this.idPeliculas = idPeliculas;
	}
	public Peliculas() {
		super();
	}
	
	
	public Peliculas(int visualizaciones) {
		super();
		this.visualizaciones = visualizaciones;
	}
	

	public void crearPelicula() {
		this.nombrePel = LecturaDatos.LeerTexto("Por favor introduzca el nombre de la película");
		this.anioEstreno = LecturaDatos.LeerInt("Por favor introduzca el año de la película");
		this.nombreCat = Peliculas.selecCat();
	}
	

	private static final Logger log = Logger.getLogger("Datos");
	
	public static String selecCat() {
		DatosCat listado = new DatosCat();
		listado.listarCat();
		String catIntroducida = LecturaDatos.LeerTexto("Por favor, introduzca una de las categorías para la película:");
		String catValida = null;
		boolean condition = true;
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "SELECT NOMBRECAT FROM CATEGORIAS";
			log.info("-----" + query);
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next() || condition) {
				if(rs.getString(1).equalsIgnoreCase(catIntroducida)) {
					catValida = catIntroducida;
					condition = false;
				}else if (catValida == null & rs.isLast() == true ) {
					System.out.println("Cantegoría introducida no válida");
					System.out.println("No se asociará una categoría a la película.");
					break;
				}		
				
			}			
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}
		return catValida;
		
	}
	public void crearPelVis() {
		this.visualizaciones = LecturaDatos.LeerInt("Introduzca el número de visualizaciones: " );
	}
}
