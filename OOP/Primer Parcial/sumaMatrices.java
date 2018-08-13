public class sumaMatrices{

	public static void main (String[] args){

	int[][] matriz1 = {
		{2,10,21},
		{4,3,9},
		{8,7,6},
		};

	int rows = matriz1.length-1;
	int cols = matriz1[0].length-1;

	System.out.println(sumaMatriz(matriz1,rows,cols));

	}//main

	public static int sumaMatriz(int[][] a, int b, int c){

		int temp = 0;

		if(b==0 && c==0){
			temp+= a[b][c];
			return temp;
		}

    	else if(c==0){
    		temp += sumaMatriz(a,b-1,a.length-1)+a[b][c];
    	}
    		
    		else{
    			temp += sumaMatriz(a,b,c-1)+a[b][c];
        		
    	}		
    	return temp; 

	}//suma matriz

}//class
