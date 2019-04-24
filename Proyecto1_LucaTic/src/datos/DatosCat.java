package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.Statement;
import model.Categorias;
import utilidades.LecturaDatos;

public class DatosCat implements IDatos{

	private static final Logger log = Logger.getLogger("Datos");
	
	public void altaCategoria(Categorias categoria) {
		
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "INSERT INTO CATEGORIAS(NOMBRECAT) VALUES ('" + categoria.getNombreCat()+"')";
			log.info("-----" + query);
			if (stmt.executeUpdate(query) != 1) {
			log.warning("Error al introducir la categoría");
			}
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}	
	}
	
	
	public void listarCat() {
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "SELECT * FROM CATEGORIAS";
			log.info("-----" + query);
			ResultSet rs = stmt.executeQuery(query);	
			while(rs.next()) {
				System.out.println("|  " + rs.getInt(1)+ "   ---->  " + rs.getString(2));
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}	
	}
	
	public void buscarCatId(int idCategorias) {
				
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "SELECT * FROM CATEGORIAS WHERE IDCATEGORIAS = "+idCategorias;
			log.info("-----" + query);
			ResultSet rs = stmt.executeQuery(query);	
			while(rs.next()) {
				System.out.println("|  " + rs.getInt(1)+ "   ---->  " + rs.getString(2));
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}
	}
	
	public void bajaCat(int idCategorias ){
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "DELETE FROM CATEGORIAS WHERE IDCATEGORIAS = "+idCategorias;
			log.info("-----" + query);
			if (stmt.executeUpdate(query) != 1) {
				log.warning("Error al introducir la categoría");
				}
			
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}
	}
	
	public void modificarCat(int idCategorias, String nombreCat) {
		try {
			nombreCat = LecturaDatos.LeerTexto("Por favor, introduzca el nuevo nombre de la categoría: ");
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "UPDATE CATEGORIAS SET NOMBRECAT =" + nombreCat + "WHERE IDCATEGORIAS = "+idCategorias;
			log.info("-----" + query);
			if (stmt.executeUpdate(query) != 1) {
				log.warning("Error al introducir la categoría");
				}
			
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}
		
	}
	}
		
		
