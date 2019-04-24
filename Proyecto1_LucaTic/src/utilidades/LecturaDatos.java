package utilidades;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LecturaDatos {

	@SuppressWarnings("resource")
	public static int LeerInt() throws InputMismatchException, NoSuchElementException, IllegalStateException{
		return new Scanner(System.in).nextInt();
	}
	
	public static int LeerInt(String msg)throws InputMismatchException, NoSuchElementException, IllegalStateException{
		System.out.println(msg);
		return LeerInt();
	}	
	
	public static String LeerTexto()throws InputMismatchException, NoSuchElementException, IllegalStateException{
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		return teclado.nextLine();
	}
	
	public static String LeerTexto(String msg)throws InputMismatchException, NoSuchElementException, IllegalStateException{
		System.out.println(msg);
		return LeerTexto();
	}	
}
