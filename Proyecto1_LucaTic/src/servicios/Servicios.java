package servicios;

import datos.DatosCat;
import model.Categorias;

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
}
