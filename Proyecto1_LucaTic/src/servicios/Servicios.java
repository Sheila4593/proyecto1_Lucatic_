package servicios;

import datos.DatosCat;
import datos.DatosPel;
import datos.DatosUsu;
import model.Categorias;
import model.Peliculas;
import model.Usuarios;

public class Servicios implements IServicios{
	
	public void altaCategoria(Categorias categoria) {
		new DatosCat().altaCategoria(categoria);
	}
	public void listarCat() {
		new DatosCat().listarCat();
		
	}
	public void buscarCatId(int idCategorias) {
		new DatosCat().buscarCatId(idCategorias);
	}
	public void bajaCat(int idCategorias) {
		new DatosCat().bajaCat(idCategorias);
		
	}
	public void modificarCat(int idCategorias, String nombreCat) {
		new DatosCat().modificarCat(idCategorias,nombreCat);
		
	}
	public void altaUsuario(Usuarios usuario) {
		new DatosUsu().altaUsuario(usuario);
	}
	public void listarUsu() {
		new DatosUsu().listarUsu();
	}
	public void buscarUsuId(int idUsuarios) {
		new DatosUsu().buscarUsuId(idUsuarios);
	}
	public void bajaUsu(int idUsuarios) {
		new DatosUsu().bajaUsu(idUsuarios);
	}
	public void modificarUsu(int idUsuarios, Usuarios usuario) {
		new DatosUsu().modificarUsu(idUsuarios, usuario);
	}
	public void altaPelicula(Peliculas pelicula) {
		new DatosPel().altaPelicula(pelicula);
	}
	public void listarPel() {
		new DatosPel().listarPel();
	}
	public void buscarPelId(int idPeliculas) {
		new DatosPel().buscarPelId(idPeliculas);
	}
	public void bajaPel(int idPeliculas) {
		new DatosPel().bajaPel(idPeliculas);
	}
	public void listarPelCat(String categoriaSelect) {
		new DatosPel().listarPelCat(categoriaSelect);
	}
	public void modificarPel(int idPeliculas, Peliculas pelicula) {
		new DatosPel().modificarPel(idPeliculas, pelicula);
	}
	public void modificarPelVis(int idPeliculas, Peliculas pelicula) {
		new DatosPel().modificarPelVis(idPeliculas, pelicula);
	}
	public void listarPelVis() {
		new DatosPel().listarPelVis();
	}
	public void modificarPelVal(int idPeliculas, Peliculas pelicula) {
		new DatosPel().modificarPelVal(idPeliculas, pelicula);
	}
	public void listarPelVal() {
		new DatosPel().listarPelVal();
	}
}
