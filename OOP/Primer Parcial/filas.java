/*
	Martin Alegria
	A01022216	
*/

import java.util.*;

public class filas{

    static int[] fila = new int[3];

    public static void main (String[] args){

    System.out.println("///////////////    PUSH");

	push(2);
	print();
	push(3);
	print();
	push(4);
	print();
	push(10);
	print();

	System.out.println("///////////////    POP");

	pop();
	print();
	pop();
	print();
	pop();
	print();
	

    }//main

    
    public static void push(int a){

    	for(int i = fila.length-1; i>0; i--){
    		fila[i] = fila[i-1];
    	}

    	fila[0] = a;
    }//push


    public static void pop(){

		for(int i = fila.length-1; i>=0; i--){
    		
			if (fila[i]!= 0) {
				fila[i] = 0;
				break;
			}

    	}//for

    }//pop

    public static void print(){
    	System.out.println(Arrays.toString(fila));
    }


}