import java.util.*;

public class subArreglos{

	public static void main(String[] args) {
		/*
		int[] test = {1,-2,4,-5,1};
		int a = calculo(test);
		System.out.println(a);		
*/

		Scanner input = new Scanner(System.in);
		System.out.println("De cuantos valores quieres tu arreglo ?");
		int n = input.nextInt();

		int[] arreglo = new int[n];

		for (int i = 0; i<n ; i++ ) {
			System.out.println("Ingresa valor de Posicion " + i);
			arreglo[i] = input.nextInt();

		}

		int a = calculo(arreglo);
		System.out.println("El numero de subarreglos negativos es " + a);


	}

	public static int calculo(int[] a){

		int sum = 0;
		int sum2 = 0;
		int cont = 0;
		int s = 0;

		for(int i = 0; i<a.length; i++) {

			if(a[i] < 0) {
				s++;
			}

		}//for



		for(int i = 0; i<a.length; i++) {

			for(int j = 0; j < a.length; j++ ) {

				sum += a[i] + a[j];
				if (sum < 0) {
					cont++;
				}

			}
			
		}

		if(s == 1) {
			return s;
			
		}else{
			return cont-s;
		}

	}//calculo

}//class