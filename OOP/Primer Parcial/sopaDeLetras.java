
import java.util.*;

public class sopaDeLetras{

	public static void main(String[] args){

		String[][] sopa1 ={

		{"D","D","D","G","D","D"},
		{"B","B","D","E","B","S"},
		{"B","S","K","E","B","K"},
		{"D","D","D","K","D","E"},
		{"D","D","D","S","D","E"},
		{"D","D","D","D","D","G"}
		
		};


		String[][] sopa2 = {

		{"B","B","M","B","B","B"},
		{"C","B","A","B","B","B"},
		{"I","B","G","B","B","B"},
		{"G","B","I","B","B","B"},
		{"A","B","C","B","B","B"},
		{"M","C","I","G","A","M"}

		};

		String geeks = "GEEKS";
		String magic = "MAGIC";

		int times = search1(sopa1, geeks);
		times += search2(sopa1, geeks);
		System.out.println("Para la Sopa 1, palabra GEEKS: " + times);
		times = search1(sopa2, magic);
		times+= search2(sopa2, magic);
		System.out.println("Para la Sopa 2, palabra MAGIC: " + times);

	}//main

	public static int search1(String[][]a, String b){

		String x, z;
		int times = 0;

		for(int i = 0; i<a.length; i++){

			x = "";
			z = "";

			for (int j= 0; j<a[0].length ; j++) {

				x += a[i][j];
				z += a[j][i];
				
			}

			if(x.contains(b))
				times ++;
			if(z.contains(b))
				times ++;

		}

		return times;

	}//buscarString

	public static int search2(String[][]a, String b){

		String x, z;
		int times = 0;

		for(int i = a.length-1; i>=0; i--){

			x = "";
			z = "";

			for (int j= a[0].length-1; j>=0; j--) {

				x += a[i][j];
				z += a[j][i];
				
			}

			if(x.contains(b))
				times ++;
			if(z.contains(b))
				times ++;

		}

		return times;

	}//buscarString


}//sopaDeLetras

