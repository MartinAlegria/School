import java.util.*;

public class Poly{

	public static void main(String[] args) {

        int mayor = 0;
        int mayorArr = 0;
        ArrayList<Object> list = new ArrayList<Object>();
        // { 1 , 2, {5,7}, 3 } <--------
        
      	Object[] index2 = new Integer[2];
      	index2[0] = 5;
      	index2[1] = 7;

      	list.add(0,1);
      	list.add(1,2);
      	list.add(2,index2);
      	list.add(3,3);

      	for(int i = 0; i<list.size(); i++ ) {
      		if(list.get(i).getClass() == Integer.class){

	      		if(i == 0){mayor = (int)list.get(i);}

	      			else{

	      				if((int)list.get(i-1) > (int)list.get(i)) {

	      					mayor = (int)list.get(i-1);
	      				}else{
	      					mayor = (int)list.get(i);
	      				}
	      			}

	      	}//IF 
	      	else{
	      		
	      		Integer[] arr = (Integer[])list.get(i);

	      		for(int j = 0; j< arr.length; j++){

					if(j == 0){mayorArr = arr[j];}

	      			else{
	      				if( arr[j-1] > arr[j]) {
	      					mayorArr = arr[j-1];
	      				}else{
	      					mayorArr = arr[j];
	      				}
	      			}
	      			
	      		}//FOR
	      		
	      	
	      	}//ELSE
      	}

	}//main

}//class