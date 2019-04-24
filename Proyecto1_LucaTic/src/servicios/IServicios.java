package servicios;

import model.Categorias;
import model.Peliculas;
import model.Usuarios;
/**
 * 
 * @author Sheila
 * 
 * Las interfaces permiten el uso de variables y métodos polimórficos y separa que hace una clase de cómo lo hace
 *
 */
public interface IServicios {
	
	public void altaCategoria(Categorias categoria);
	public void listarCat();
	public void buscarCatId(int idCategorias);
	public void bajaCat(int idCategorias);
	public void modificarCat(int idCategorias, String nombreCat);
	public void altaUsuario(Usuarios usuario);
	public void listarUsu();
	public void buscarUsuId(int idUsuarios);
	public void bajaUsu(int idUsuarios);
	public void modificarUsu(int idUsuarios, Usuarios usuario);
	public void altaPelicula(Peliculas pelicula);
	public void listarPel();
	public void buscarPelId(int idPeliculas);
	public void bajaPel(int idPeliculas);
	public void listarPelCat(String categoriaSelect);
	public void modificarPel(int idPeliculas, Peliculas pelicula);
	public void modificarPelVis(int idPeliculas, Peliculas pelicula);
	public void listarPelVis();
	public void modificarPelVal(int idPeliculas, Peliculas pelicula);

}
