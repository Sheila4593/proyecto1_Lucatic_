package datos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
/**
 * 
 * @author Sheila
 * 23/04/2019
 *
 */
public class ConexionBBDD {
	
	private static Connection con = null;
	private static String driverClassName = "com.mysql.jdbc.Driver";
	private static String driverUrl = "jdbc:mysql://localhost/proyecto1?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String pass = "root";
	
	
	final static Logger log = Logger.getLogger("BBDD");
	/**
	 * Se crea un método llamado conectar que posibilita la conexión con la base de datos
	 * @return con
	 */
	public static Connection Conectar() {
		try {
			/**
			 * Se utiliza el forName para inicializar el driver y después se utiliza el
			 * método getConnection para establecer la conexión con la base de datos
			 * que se devolverá al finalizar el método
			 */
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, pass);
			
			/**
			 * Se añaden excepciones para los posibles errores que puedan ocurrir al producirse la conexión
			 */
		} catch (ClassNotFoundException | SQLException | LinkageError e) {
			e.printStackTrace();
			log.warning("--->" +"Error al insertar el tipo de dato " + e.getCause());
		}
		return con;
	}
	
}
