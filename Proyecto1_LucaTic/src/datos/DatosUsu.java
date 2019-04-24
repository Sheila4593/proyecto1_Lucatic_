package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import model.Usuarios;

public class DatosUsu implements IDatosUsu{
	
private static final Logger log = Logger.getLogger("Datos");
	
	public void altaUsuario(Usuarios usuario) {
		
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "INSERT INTO USUARIOS(NOMBREUSU,APELLIDOSUSU,DIRECCIONUSU,SUSCRIPCION) VALUES ('" + usuario.getNombreUsu() + "', '" + usuario.getApellidos() + "', '" + usuario.getDireccion() + "', '" + usuario.getSuscripcion() + "') ";
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
	public void listarUsu() {
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "SELECT * FROM USUARIOS";
			log.info("-----" + query);
			ResultSet rs = stmt.executeQuery(query);	
			while(rs.next()) {
				System.out.println("|  " + rs.getInt(1)+ "   ---->  " + rs.getString(2) +"  " + rs.getString(3) + " Dirección: " + rs.getString(3) + "  Suscripción: " + rs.getString(4));
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}	
	}
	
	public void buscarUsuId(int idUsuarios) {
		
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "SELECT * FROM USUARIOS WHERE IDUSUARIOS = "+idUsuarios;
			log.info("-----" + query);
			ResultSet rs = stmt.executeQuery(query);	
			while(rs.next()) {
				System.out.println("|  " + rs.getInt(1)+ "   ---->  " + rs.getString(2) +"  " + rs.getString(3) + " Dirección: " + rs.getString(3) + "  Suscripción: " + rs.getString(4) + "  |");
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}
	}
	
	public void bajaUsu(int idUsuarios ){
		try {
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "DELETE FROM USUARIOS WHERE IDUSUARIOS = "+idUsuarios;
			log.info("-----" + query);
			stmt.executeUpdate(query);
		
			
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}
	}
	
	public void modificarUsu(int idUsuarios, Usuarios usuario) {
		try {
			usuario.crearUsuario();
			Statement stmt = ConexionBBDD.Conectar().createStatement();
			String query = "UPDATE USUARIOS SET NOMBREUSU = '" + usuario.getNombreUsu() + "' ,APELLIDOSUSU = '" + usuario.getApellidos() + "',DIRECCIONUSU = '" + usuario.getDireccion() + "', SUSCRIPCION ='" + usuario.getSuscripcion() + "' WHERE IDUSUARIOS = "+idUsuarios;
			log.info("-----" + query);
			stmt.executeUpdate(query);
			
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("---" + se.getSQLState());
			System.out.println("---" + se.getCause());
			System.out.println("---" + se.getErrorCode());
			
		}
		
	}
	

}
