package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ConexionBBDD {
	
	private static Connection con = null;
	private static String driverClassName = "com.mysql.jdbc.Driver";
	private static String driverUrl = "jdbc:mysql://localhost/proyecto1";
	private static String user = "root";
	private static String pass = "root";
	final static Logger log = LogManager.getLogger("BBDD");
	public static Connection Conecta_BBDD() {
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			log.error("--->" +"Error al insertar el tipo de dato");
		}
		return con;
	}
	
}
