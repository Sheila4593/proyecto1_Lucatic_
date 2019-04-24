package datos;

import model.Usuarios;

public interface IDatosUsu {
	public void altaUsuario(Usuarios usuario);
	public void listarUsu();
	public void buscarUsuId(int idUsuarios);
	public void bajaUsu(int idUsuarios);
	public void modificarUsu(int idUsuarios, Usuarios usuario);

}
