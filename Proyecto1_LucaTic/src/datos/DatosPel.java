package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import model.Peliculas;



public class DatosPel {

private static final Logger log = Logger.getLogger("Datos");	
public void altaPelicula(Peliculas pelicula) {
		
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "INSERT INTO PELICULAS(NOMBREPEL,ANIOESTRENO,NOMBRECAT) VALUES ('" + pelicula.getNombrePel() + "', " + pelicula.getAnioEstreno() + ", '" + pelicula.getNombreCat() +  "') ";
			log.info("-----" + query);
			if (stmt.executeUpdate(query) != 1) {
			log.warning("Error al introducir la película");
			}
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}	
	}
public void listarPel() {
	try {
		Statement stmt = ConexionBBDD.Conectar().createStatement();
		String query = "SELECT * FROM PELICULAS";
		log.info("-----" + query);
		ResultSet rs = stmt.executeQuery(query);	
		while(rs.next()) {
			System.out.println("|  Película: " + rs.getString(1)+ "   ---->  " + " Año de estreno: "+ rs.getInt(2) +"  Categoría: " + rs.getString(3) + "  ID: " + rs.getInt(4));
		}
		
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("---" + se.getSQLState());
		System.out.println("---" + se.getCause());
		System.out.println("---" + se.getErrorCode());
		
	}	
}

public void buscarPelId(int idPeliculas) {
	
	try {
		Statement stmt = ConexionBBDD.Conectar().createStatement();
		String query = "SELECT * FROM PELICULAS WHERE IDPELICULAS = "+idPeliculas;
		log.info("-----" + query);
		ResultSet rs = stmt.executeQuery(query);	
		while(rs.next()) {
			System.out.println("|  Película: " + rs.getString(1)+ "   ---->  " + " Año de estreno: "+ rs.getInt(2) +"  Categoría: " + rs.getString(3) + "  ID: " + rs.getInt(4) + "  |");
		}
		
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("---" + se.getSQLState());
		System.out.println("---" + se.getCause());
		System.out.println("---" + se.getErrorCode());
		
	}
}

public void bajaPel(int idPeliculas ){
	try {
		Statement stmt = ConexionBBDD.Conectar().createStatement();
		String query = "DELETE FROM PELICULAS WHERE IDPELICULAS = "+idPeliculas;
		log.info("-----" + query);
		stmt.executeUpdate(query);
	
		
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("---" + se.getSQLState());
		System.out.println("---" + se.getCause());
		System.out.println("---" + se.getErrorCode());
		
	}
}

public void modificarPel(int idPeliculas, Peliculas pelicula) {
	try {
		pelicula.crearPelicula();
		Statement stmt = ConexionBBDD.Conectar().createStatement();
		String query = "UPDATE PELICULAS SET NOMBREPEL = '" + pelicula.getNombrePel() + "' ,ANIOESTRENO = '" + pelicula.getAnioEstreno() + "',NOMBRECAT = '" + pelicula.getNombreCat() + "' WHERE IDPELICULAS = "+idPeliculas;
		log.info("-----" + query);
		stmt.executeUpdate(query);
		
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("---" + se.getSQLState());
		System.out.println("---" + se.getCause());
		System.out.println("---" + se.getErrorCode());
		
	}
}
	

public void modificarPelVis(int idPeliculas, Peliculas pelicula) {
	try {
		pelicula.crearPelVis();
		Statement stmt = ConexionBBDD.Conectar().createStatement();
		String query = "UPDATE PELICULAS SET VISUALIZACIONES = '" + pelicula.getVisualizaciones() + "' WHERE IDPELICULAS = "+idPeliculas;
		log.info("-----" + query);
		stmt.executeUpdate(query);
		
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("---" + se.getSQLState());
		System.out.println("---" + se.getCause());
		System.out.println("---" + se.getErrorCode());
		
	}
}

public void listarPelCat(String categoriaSelec) {
	
	try {
		Statement stmt = ConexionBBDD.Conectar().createStatement();
		String query = "SELECT * FROM PELICULAS WHERE NOMBRECAT = '" +categoriaSelec + "'";
		log.info("-----" + query);
		ResultSet rs = stmt.executeQuery(query);	
		int contador = 0;
		while(rs.next()) {
			if(rs.getString(3).equalsIgnoreCase(categoriaSelec)) {
				System.out.println("|  Película: " + rs.getString(1)+ "   ---->  " + " Año de estreno: "+ rs.getInt(2) +"  Categoría: " + rs.getString(3) + "  ID: " + rs.getInt(4) + "  |");
				contador++;
			}else if (rs.isLast() == true && contador == 0) {
				System.out.println("No existe ninguna película con esa categoría");
				break;
			}System.out.println(contador);		
		}
		
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("---" + se.getSQLState());
		System.out.println("---" + se.getCause());
		System.out.println("---" + se.getErrorCode());
		
	}
}
public void listarPelVis() {
	
	try {
		Statement stmt = ConexionBBDD.Conectar().createStatement();
		String query = "SELECT * FROM PELICULAS ORDER BY VISUALIZACIONES DESC";
		log.info("-----" + query);
		ResultSet rs = stmt.executeQuery(query);	
		while(rs.next()) {
			System.out.println("|  Película: " + rs.getString(1)+ "   ---->  " + " VIsualizaciones: " + rs.getInt(5) );
		
		}
		
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("---" + se.getSQLState());
		System.out.println("---" + se.getCause());
		System.out.println("---" + se.getErrorCode());
		
	}
}

public void modificarPelVal(int idPeliculas, Peliculas pelicula) {
	try {
		pelicula.crearPelVis();
		Statement stmt = ConexionBBDD.Conectar().createStatement();
		String query = "UPDATE PELICULAS SET VALORACION = '" + pelicula.getVisualizaciones() + "' WHERE IDPELICULAS = "+idPeliculas;
		log.info("-----" + query);
		stmt.executeUpdate(query);
		
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("---" + se.getSQLState());
		System.out.println("---" + se.getCause());
		System.out.println("---" + se.getErrorCode());
		
	}
}

public void listarPelVal() {
	
	try {
		Statement stmt = ConexionBBDD.Conectar().createStatement();
		String query = "SELECT * FROM PELICULAS ORDER BY VALORACION DESC";
		log.info("-----" + query);
		ResultSet rs = stmt.executeQuery(query);	
		while(rs.next()) {
			System.out.println("|  Película: " + rs.getString(1)+ "   ---->  " + " Valoraciones: " + rs.getInt(6) );
		
		}
		
	} catch (SQLException se) {
		se.printStackTrace();
		System.out.println("---" + se.getSQLState());
		System.out.println("---" + se.getCause());
		System.out.println("---" + se.getErrorCode());
		
	}
}

}
