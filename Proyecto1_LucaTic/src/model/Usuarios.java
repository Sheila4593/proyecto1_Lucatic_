package model;

import utilidades.LecturaDatos;

public class Usuarios {
	
	private int idusuarios;
	private String nombreUsu;
	private String apellidos;
	private String direccion;
	private String suscripcion;
	public int getIsusuarios() {
		return idusuarios;
	}
	public void setIdusuarios(int idusuarios) {
		this.idusuarios = idusuarios;
	}
	public String getNombreUsu() {
		return nombreUsu;
	}
	public void setNombreUsu(String nombreUsu) {
		this.nombreUsu = nombreUsu;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSuscripcion() {
		return suscripcion;
	}
	public void setSuscripcion(String suscripcion) {
		this.suscripcion = suscripcion;
	}
	@Override
	public String toString() {
		return "Usuarios [idusuarios=" + idusuarios + ", nombreUsu=" + nombreUsu + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + ", suscripcion=" + suscripcion + "]";
	}
	public Usuarios(int idusuarios, String nombreUsu, String apellidos, String direccion, String suscripcion) {
		super();
		this.idusuarios = idusuarios;
		this.nombreUsu = nombreUsu;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.suscripcion = suscripcion;
	}
	public Usuarios() {
		super();
	}
	
	public void crearUsuario() {
		this.nombreUsu = LecturaDatos.LeerTexto("Por favor, introduzca el nombre del usuario: ");
		this.apellidos = LecturaDatos.LeerTexto("Por favor, introduzca los apellidos del usuario: ");
		this.direccion = LecturaDatos.LeerTexto("Por favor, introduzca la dirección del usuario: ");
		this.suscripcion = "PREMIUM";
	}
	
	
	

}
