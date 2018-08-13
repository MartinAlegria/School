import java.util.*;
import java.lang.*;

public class CalculadoraFracciones{

	static Scanner input = new Scanner(System.in);
	static ArrayList<Fraccion> fracciones = new ArrayList<Fraccion>();
	static Fraccion f;
	static int fraccionCount = 0;
	static Fraccion prueba = new Fraccion(1,2);
	static Libro l = new Libro("Hola", "Yo", 200);
	static boolean loop = true;

	public static void main(String[] args) {

		System.out.println("BIENVENIDO!");

		do{
			menu();
			int opcion = input.nextInt();

			switch(opcion){

				case 1:
					System.out.println("");
					addFraccion();
					System.out.println("");
					break;

				case 2:
					System.out.println("");
					sumar();
					System.out.println("");
					break;

				case 3:
					System.out.println("");
					restar();
					System.out.println("");
					break;

				case 4:
					System.out.println("");
					multiplicar();
					System.out.println("");
					break;

				case 5:
					System.out.println("");
					dividir();
					System.out.println("");
					break;

				case 6:
					System.out.println("");
					menoresTerminos();
					System.out.println("");
					break;

				case 7: 
					System.out.println("");
					comparar();
					System.out.println("");
					break;

				case 8:
					System.out.println("");
					printFracs();
					System.out.println("");
					break;

				case 9:
					System.out.println("");
					System.exit(0);
					System.out.println("");
					break;

				default:
				System.out.println("\tLa opcion no existe");
				 break;
			}

		}while(true);

	}


	public static void menu(){
		System.out.println("\tQue deseas hacer ? [escoge el numero de tu seleccion]");
		System.out.println("\t1.- Añadir Fraccion");
		System.out.println("\t2.- Sumar Fracciones");
		System.out.println("\t3.- Restar Fracciones");
		System.out.println("\t4.- Multiplicar Fracciones");
		System.out.println("\t5.- Divir Fracciones");
		System.out.println("\t6.- Fraccion A Sus Menores Terminos");
		System.out.println("\t7.- Comparar Objeto");
		System.out.println("\t8.- Imprimir Fraciones Guardas");
		System.out.println("\t9.- Salir");
	}

	public static void addFraccion(){

		char ans;
		do{

			do{

				try{

					System.out.println("Cual es el numerador:");
					int numerador = input.nextInt();

					System.out.println("Cual es el denominador:");
					int denominador = input.nextInt();

					f = new Fraccion(numerador, denominador);
					fracciones.add(0,f);
					fraccionCount++;
					loop = false;

				}catch(ArtihmeticException e){
					System.err.printf("\nExcepcion: %s\n", e);
				}
				

			}while(loop);

			System.out.println("Quieres añadir otra fraccion ? [y/n]");

			ans = input.next().charAt(0);
		
		}while(Character.toLowerCase(ans) == 'y');

	}//addFraccion

	public static void sumar(){
		boolean count = checkCount();

		if(count){

			System.out.println("\tEscoge las fracciones que quieres utilizar:");
			printFracs();
			System.out.println("Primera Fraccion:  [escoge el numero de tu seleccion]");
			int primera = input.nextInt();
			System.out.println("Segunda Fraccion:  [escoge el numero de tu seleccion]");
			int segunda = input.nextInt();

			f = fracciones.get(primera-1).add(fracciones.get(segunda-1));
			fracciones.add(0,f);
			System.out.println("El resultado es " + f.toString() + " ó " + f.toDouble());

		}else{
			System.out.println("\tNo tienes suficientes fracciones para hacer una operación");
		}
	}

	public static void restar(){
		boolean count = checkCount();

		if(count){

			System.out.println("\tEscoge las fracciones que quieres utilizar:");
			printFracs();
			System.out.println("Primera Fraccion:  [escoge el numero de tu seleccion]");
			int primera = input.nextInt();
			System.out.println("Segunda Fraccion:  [escoge el numero de tu seleccion]");
			int segunda = input.nextInt();

			f = fracciones.get(primera-1).substract(fracciones.get(segunda-1));
			fracciones.add(0,f);
			System.out.println("El resultado es " + f.toString() + " ó " + f.toDouble());

		}else{
			System.out.println("\tNo tienes suficientes fracciones para hacer una operación");
		}
	}

	public static void multiplicar(){
		boolean count = checkCount();

		if(count){

			System.out.println("\tEscoge las fracciones que quieres utilizar:");
			printFracs();
			System.out.println("Primera Fraccion:  [escoge el numero de tu seleccion]");
			int primera = input.nextInt();
			System.out.println("Segunda Fraccion:  [escoge el numero de tu seleccion]");
			int segunda = input.nextInt();

			f = fracciones.get(primera-1).multiply(fracciones.get(segunda-1));
			fracciones.add(0,f);
			System.out.println("El resultado es " + f.toString() + " ó " + f.toDouble());

		}else{
			System.out.println("\tNo tienes suficientes fracciones para hacer una operación");
		}
	}

	public static void dividir(){
		boolean count = checkCount();

		if(count){

			System.out.println("\tEscoge las fracciones que quieres utilizar:");
			printFracs();
			System.out.println("Primera Fraccion:  [escoge el numero de tu seleccion]");
			int primera = input.nextInt();
			System.out.println("Segunda Fraccion:  [escoge el numero de tu seleccion]");
			int segunda = input.nextInt();

			f = fracciones.get(primera-1).divide(fracciones.get(segunda-1));
			fracciones.add(0,f);
			System.out.println("El resultado es " + f.toString() + " ó " + f.toDouble());

		}else{
			System.out.println("\tNo tienes suficientes fracciones para hacer una operación");
		}
	}

	public static void menoresTerminos(){

		System.out.println("\tEscoge las fracciones que quieres utilizar: [escoge el numero de tu seleccion]");
		printFracs();
		int index = input.nextInt() - 1;
		f = fracciones.get(index).toLowestTerms();
		fracciones.remove(index);
		fracciones.add(index,f);
		System.out.println("\t" + f.toString());
		System.out.println("\tLa fraccion fue remplazada por ella misma en sus menores terminos");
	}

	public static void comparar(){
		System.out.println("\tEscoge las fracciones que quieres utilizar: [escoge el numero de tu seleccion]");
		printFracs();
		int index = input.nextInt() - 1;
		// fracciones.get(index).isEquals(prueba); //LA PRUEBA
		fracciones.get(index).isEquals(l);

	}
	public static boolean checkCount(){ //Checa que al menos haya 2 fracciones para usar

		if(fraccionCount >= 2) {
			return true;
		}else{
			return false;
		}

	}//checkCount

	public static void printFracs(){
		System.out.println("\t FRACCIONES:");
		for (int i = 0; i<fracciones.size(); i++) {
			System.out.println("\t" + (i+1) + ".- " + fracciones.get(i).toString());
		}
	}//printFracs

	/*adasd*/

}