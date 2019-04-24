package datos;

import model.Peliculas;


public interface IDatosPel {

	public void altaPelicula(Peliculas pelicula);
	public void listarPel();
	public void buscarPelId(int idPeliculas);
	public void bajaPel(int idPeliculas);
	public void listarPelCat(String categoriaSelect);
	public void modificarPel(int idPeliculas, Peliculas pelicula);
	public void modificarPelVis(int idPeliculas, Peliculas pelicula);
	public void listarPelVis();
	public void modificarPelVal(int idPeliculas, Peliculas pelicula);
	public void listarPelVal();
}
