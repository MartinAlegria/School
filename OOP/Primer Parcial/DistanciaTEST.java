import java.util.*;

public class DistanciaTEST{

	static Scanner input  = new Scanner(System.in);
	static int x = 0,  v = 0;
	static boolean neg = true;
	static Distancia canguro1 = new Distancia();
	static Distancia canguro2 = new Distancia();

	public static void main(String[] args){

		initData();
		System.out.println( "Primer Canguro: \nVelocidad: " + x + "\nPosicion inicial: " + v + "\n");
		canguro1.modData(x,v);

		initData();
		System.out.println( "Segundo Canguro: \nVelocidad: " + x + "\nPosicion inicial: " + v + "\n");
		canguro2.modData(x,v);

		if(canguro1.getInitX() == canguro2.getInitX() && canguro1.getVelocity() == canguro2.getVelocity()) {

			System.out.println("SI");
		}
		else{

			boolean alcance = alcance();

			if(alcance) {
			System.out.println("SI");
			}
			else{
			System.out.println("NO");
			}
		}

	}//main

	public static void initData(){


		System.out.println("Cual es la posicion inicial del canguro ?");
		do{
		x = input.nextInt();

			if (x<0) {
				System.out.println("La posicion inicial no puede ser negativa, intenta de nuevo");
			}
			else{
				break;
			}

		} while(neg);	

			System.out.println("Cual es la velocidad del canguro ?");
		do{
		v = input.nextInt();

			if (v<0) {
				System.out.println("La velocidad no puede ser negativa, intenta de nuevo");
			}
			else{
				break;
			}

		} while(neg);

	}

	public static boolean alcance(){

		int x1 = canguro1.getInitX();
		int x2 = canguro2.getInitX();

		int v1 = canguro1.getVelocity();
		int v2 = canguro2.getVelocity();


		if(x1>x2){

			int ventaja = x2 - x1;
			int tiempoDeAlcane = ventaja/(v1 - v2);

			if (tiempoDeAlcane > 0) {
				return true;
			}
			else{
				return false;
			}

		}
		else{

			int ventaja = x1 - x2;
			int tiempoDeAlcane = ventaja/(v2 - v1);

			if (tiempoDeAlcane > 0) {
				return true;
			}
			else{
				return false;
			}

		}

	}//alcance


}//distancia_test