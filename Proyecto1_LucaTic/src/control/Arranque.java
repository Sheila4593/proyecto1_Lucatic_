package control;

import gui.Menu;
import gui.MenuGesCat;
import utilidades.LecturaDatos;
import model.Categorias;
import servicios.Servicios;

public class Arranque {

	public void menu() {
	
			Menu.imprimirMenu();
			System.out.println("Por favor, introduzca una de las opciones del menú: ");
			int mainMenu = LecturaDatos.LeerInt();
			switch(mainMenu) {
				case 1:
					MenuGesCat.imprimirMenuCat();
					System.out.println("Por favor, introduzca una de las opciones del menú: ");
					int menuCat = LecturaDatos.LeerInt();
					Categorias categoria = new Categorias();
					
					switch(menuCat) {
						case 1:
							categoria.crearCategoria();
							new Servicios().altaCategoria(categoria);
							break;
						case 2:
							new Servicios().listarCat();
							int idCategorias = LecturaDatos.LeerInt("Por favor, indique el ID de la categoría que desee ELIMINAR: ");
							new Servicios().buscarCatId(idCategorias);
							String selection = LecturaDatos.LeerTexto("¿Está seguro de eliminar esta categoría?  Y/N ");
							if (selection.equalsIgnoreCase("Y")){
								new Servicios().bajaCat(idCategorias);
							}else {
								Menu.imprimirMenu();
							}
						case 3:
							new Servicios().listarCat();
							idCategorias = LecturaDatos.LeerInt("Por favor, indique el ID de la categoría que desee MODIFICAR: ");
							new Servicios().buscarCatId(idCategorias);
							new Servicios().modificarCat(idCategorias, "");
							
					}
					break;
					
}
}
	}