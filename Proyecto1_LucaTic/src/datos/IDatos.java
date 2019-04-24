package datos;

import model.Categorias;


public interface IDatos {
	
	public void altaCategoria(Categorias categoria);
	public void listarCat();
	public void buscarCatId(int idCategorias);
	public void bajaCat(int idCategorias);
	public void modificarCat(int idCategorias, String nombreCat);
	
	
}
