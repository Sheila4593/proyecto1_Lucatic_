package servicios;

import model.Categorias;
/**
 * 
 * @author Sheila
 * 
 * Las interfaces permiten el uso de variables y m�todos polim�rficos y separa que hace una clase de c�mo lo hace
 *
 */
public interface IServicios {
	
	public void altaCategoria(Categorias categoria);
	public void listarCat();
	public void buscarCatId(int idCategorias);
	public void bajaCat(int idCategorias);
	public void modificarCat(int idCategorias, String nombreCat);

}
