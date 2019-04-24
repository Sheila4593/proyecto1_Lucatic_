package control;

import gui.Menu;
import gui.MenuGesCat;
import gui.MenuGesPel;
import gui.MenuGesUsu;
import utilidades.LecturaDatos;
import model.Categorias;
import model.Peliculas;
import model.Usuarios;
import servicios.Servicios;

public class Arranque {

	public void menu() {
		int mainMenu = 0;
		
		while(mainMenu != 11) {
		Menu.imprimirMenu();
		System.out.println("Por favor, introduzca una de las opciones del menú: ");
		mainMenu = LecturaDatos.LeerInt();
		switch (mainMenu) {
		case 1:
			MenuGesCat.imprimirMenuCat();
			System.out.println("Por favor, introduzca una de las opciones del menú: ");
			int menuCat = LecturaDatos.LeerInt();
			Categorias categoria = new Categorias();

			switch (menuCat) {
			case 1:
				categoria.crearCategoria();
				new Servicios().altaCategoria(categoria);
				break;
			case 2:
				new Servicios().listarCat();
				int idCategorias = LecturaDatos
						.LeerInt("Por favor, indique el ID de la categoría que desee ELIMINAR: ");
				new Servicios().buscarCatId(idCategorias);
				String selection = LecturaDatos.LeerTexto("¿Está seguro de eliminar esta categoría?  Y/N ");
				if (selection.equalsIgnoreCase("Y")) {
					new Servicios().bajaCat(idCategorias);
				} else {
					Menu.imprimirMenu();
				}
				break;
			case 3:
				new Servicios().listarCat();
				idCategorias = LecturaDatos.LeerInt("Por favor, indique el ID de la categoría que desee MODIFICAR: ");
				new Servicios().buscarCatId(idCategorias);
				new Servicios().modificarCat(idCategorias, "");
				break;

			}
			break;
		case 2:
			MenuGesUsu.imprimirMenuUsu();
			System.out.println("Por favor, introduzca una de las opciones del menú: ");
			int menuUsu = LecturaDatos.LeerInt();
			Usuarios usuario = new Usuarios();

			switch (menuUsu) {
			case 1:
				usuario.crearUsuario();
				new Servicios().altaUsuario(usuario);
				break;
			case 2:
				new Servicios().listarUsu();
				int idUsuarios = LecturaDatos.LeerInt("Por favor, indique el ID del usuario que desee ELIMINAR: ");
				new Servicios().buscarUsuId(idUsuarios);
				String selection = LecturaDatos.LeerTexto("¿Está seguro de eliminar esta usuario?  Y/N ");
				if (selection.equalsIgnoreCase("Y")) {
					new Servicios().bajaUsu(idUsuarios);
				} else {
					Menu.imprimirMenu();
				}
				break;
			case 3:
				new Servicios().listarUsu();
				idUsuarios = LecturaDatos.LeerInt("Por favor, indique el ID del usuario que desee MODIFICAR: ");
				new Servicios().buscarUsuId(idUsuarios);
				new Servicios().modificarUsu(idUsuarios, usuario);
				break;

			}break;
		case 3:
			MenuGesPel.imprimirMenuPel();
			System.out.println("Por favor, introduzca una de las opciones del menú: ");
			int menuPel = LecturaDatos.LeerInt();
			Peliculas pelicula = new Peliculas();
			switch (menuPel) {
			case 1:
				pelicula.crearPelicula();
				new Servicios().altaPelicula(pelicula);
				break;
			case 2:
				new Servicios().listarPel();
				int idPeliculas = LecturaDatos.LeerInt("Por favor, indique el ID de la película que desee ELIMINAR: ");
				new Servicios().buscarPelId(idPeliculas);
				String selection = LecturaDatos.LeerTexto("¿Está seguro de eliminar esta usuario?  Y/N ");
				if (selection.equalsIgnoreCase("Y")) {
					new Servicios().bajaPel(idPeliculas);
				} else {
					Menu.imprimirMenu();
				}
				break;
			case 3:
				new Servicios().listarPel();
				idPeliculas = LecturaDatos.LeerInt("Por favor, indique el ID de la película que desee MODIFICAR: ");
				new Servicios().buscarPelId(idPeliculas);
				new Servicios().modificarPel(idPeliculas, pelicula);
				break;
				
			}break;
		case 4:
			new Servicios().listarPel();
			break;
		case 5:
			new Servicios().listarUsu();
			break;
		case 6:
			new Servicios().listarCat();
			String categoriaSelec = LecturaDatos.LeerTexto("Por favor, indique que categoría quiere:  ");
			new Servicios().listarPelCat(categoriaSelec);
			break;
		case 7:
			Peliculas peli = new Peliculas();
			new Servicios().listarPel();
			int idPeliculas = LecturaDatos.LeerInt("Por favor, indique el ID de la película de la cual desee MODIFICAR las visualizaciones: ");
			new Servicios().buscarPelId(idPeliculas);
			new Servicios().modificarPelVis(idPeliculas, peli);
			break;
		case 8:
			new Servicios().listarPelVis();
			break;
		case 9:
			Peliculas pelic = new Peliculas();
			new Servicios().listarPel();
			idPeliculas = LecturaDatos.LeerInt("Por favor, indique el ID de la película de la cual desee MODIFICAR las visualizaciones: ");
			new Servicios().buscarPelId(idPeliculas);
			new Servicios().modificarPelVal(idPeliculas, pelic);
			break;
		case 10:
			new Servicios().listarPelVal();
			break;
		}
	}
}
}