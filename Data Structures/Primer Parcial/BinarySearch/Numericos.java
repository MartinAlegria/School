import java.util.Scanner;

public class Numericos{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] nums = {3,5,7,9,11,13,15,17,19,21,24,27,30};
		System.out.println("Escribe el numero que quieres buscar");
		int in = input.nextInt();

		System.out.println(binarySearch(nums, nums.length-1, 0, in) + " ----- ITERATIVO");
		
		int recursive = recursiveBinary(nums, nums.length-1, 0, in);
		if(recursive>=0) {
			System.out.println(in + " se encuentra en la posicion: " + recursive + " ----- RECURSIVO");
		}else{
			System.out.println(in + " no se encuentra en la lista" + " ----- RECURSIVO");
		}

	}

	//BINARY SEARCH ITERATIVO
	public static boolean binarySearch(int[] a, int high, int low, int b){

		while(low <= high){

			int mid = (low+high)/2;

			if(a[mid] == b){
				return true;
			}
			else if(b > a[mid]){
				low = mid+1;
			}
			else if(b < a[mid]){
				high = mid-1;
			}

		}//while

		return false;

	}//BINARY SEARCH ITERATIVO


	//BINARY SEARCH RECURSIVO
	public static int recursiveBinary(int[] a, int high, int low, int b){

		int mid = (high+low)/2;

		if(a[mid] == b) {
			return mid;
		}
		else if(high < low){
			return -1;
		}else{
			if(b>a[mid]) {
				return recursiveBinary(a, high, mid+1, b);
			}
			else{
				return recursiveBinary(a, mid-1, low, b);
			}
		}


	}//RECURSIVE BINARY

}