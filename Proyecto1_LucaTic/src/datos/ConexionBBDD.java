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
	 * Se crea un m�todo llamado conectar que posibilita la conexi�n con la base de datos
	 * @return con
	 */
	public static Connection Conectar() {
		try {
			/**
			 * Se utiliza el forName para inicializar el driver y despu�s se utiliza el
			 * m�todo getConnection para establecer la conexi�n con la base de datos
			 * que se devolver� al finalizar el m�todo
			 */
			Class.forName(driverClassName);
			con = DriverManager.getConnection(driverUrl, user, pass);
			
			/**
			 * Se a�aden excepciones para los posibles errores que puedan ocurrir al producirse la conexi�n
			 */
		} catch (ClassNotFoundException | SQLException | LinkageError e) {
			e.printStackTrace();
			log.warning("--->" +"Error al insertar el tipo de dato " + e.getCause());
		}
		return con;
	}
	
}
