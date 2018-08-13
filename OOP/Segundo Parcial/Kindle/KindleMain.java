import java.util.*;

public class KindleMain{

	static Scanner input = new Scanner(System.in);
	static ArrayList<Libro> libroList = new ArrayList<Libro>();
	static Libro libro;
	static String separador = "////////////////////////////////////////////////";

	public static void main(String[] args) {
		int menuAns = 0;
		boolean salir = false;

	do{
		
		do{
			menu();
			menuAns = input.nextInt();
		}while(menuAns >6 || menuAns<1);

		switch(menuAns){

			case 1:
				addBook();
				break;
			case 2:
				readBook();
				break;
			case 3:
				deleteBook();
				break;
			case 4:
				printLibrary();
				break;
			case 5:
				printLast();
				break;

			default:
				System.exit(0);
				break;
		}

	}while(!salir);

	}//main

	public static void menu(){
		System.out.println("\nBienvenido, que accion desea hacer: [Escoja el numero]");
		System.out.println("1. Añadir Libro");
		System.out.println("2. Leer libro");		
		System.out.println("3. Eliminar Libro");
		System.out.println("4. Imprimir Libreria");
		System.out.println("5. Imprimir Ultimo Libro Usado/Agregado");
		System.out.println("6. Salir");
	}//menu

	public static void addBook(){	
		char ans;

		do{

		System.out.println("Cual es el titulo del libro: [usa guion bajo para espacios] \nEj: Darkest_Hour");
		String titulo = input.next();
		System.out.println("Cual es el autor del libro ?");
		String autor = input.next();
		System.out.println("Cuantas paginas tiene ?");
		int paginas = input.nextInt();

		libro = new Libro(titulo, autor, paginas);
		libroList.add(0,libro);

		System.out.println("Deseas agregar otro libro ? [y/n]");
		ans = input.next().charAt(0);
		}while(Character.toLowerCase(ans) == 'y');
 

	}//addBook

	public static void readBook(){
		String libroLeer;
		boolean encontrado = false;

		System.out.println("Ingresa el titulo del libro que quieres leer [Usa guion bajo para los espacios]");
		String l = input.next();
		libroLeer = l.toLowerCase();
		int deleteIndex = 0;

		for (int i = 0; i<libroList.size(); i++) {

			String l2 = libroList.get(i).getTitulo();
			String tituloLibro = l2.toLowerCase();

			if(libroLeer.equals(tituloLibro)){
				System.out.println(separador);
				System.out.println("\nEl usuario esta leyendo '" + l2 + "'\n");
				System.out.println(separador);
				encontrado = true;
				deleteIndex = i;
			}//if
		}//for
		if(!encontrado){ 
			System.out.println("No se encontro el libro que estabas buscando");
		}else{
			libroList.add(0, libroList.get(deleteIndex));
			libroList.remove(deleteIndex+1);
		}
	}//readBook

	public static void printLibrary(){
		for(int i = 0; i<libroList.size(); i++ ) {
			System.out.println(separador);
			libroList.get(i).printData();
			System.out.println(separador);
		}
	}//printLibrary

	public static void printLast(){
		System.out.println("El ultimo libro que fue leido/añadido es: '" + libroList.get(0).getTitulo() + "'");

	}//printLast

	public static void deleteBook(){

		String libroDel;
		boolean encontrado = false;
		int delIndex = 0;

		System.out.println("Ingresa el titulo del libro que quieres leer [Usa guion bajo para los espacios]");
		String l = input.next();
		libroDel = l.toLowerCase();

		for (int i = 0; i<libroList.size(); i++) {

			String l2 = libroList.get(i).getTitulo();
			String tituloLibro = l2.toLowerCase();

			if(libroDel.equals(tituloLibro)){
				System.out.println(separador);
				System.out.println("\nEliminaste el libro '" + l2 + "'\n");
				System.out.println(separador);
				encontrado = true;
				delIndex = i;

			}//if
		}//for

		if(!encontrado){ 
			System.out.println("No se encontro el libro que estabas buscando");
		}else{
			libroList.remove(delIndex);
		}

	}//deleteBook

}//class