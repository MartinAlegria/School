/*
    Martin Alegria
    A01022216
 */
package sorts;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mav
 */
public class Sorts {

    protected static void intercambio(ArrayList<Persona> list){
        Persona temp;
        for(int i = 0; i<list.size(); i++){
            
            for(int j = i+1; j<list.size()-1; j++ ){
                
                if(list.get(i).getNacimiento().after(list.get(j).getNacimiento())){
                    
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                    
                }
                
            }
            
        }
        
    }//1
    
    
    protected static void seleccion(ArrayList<Persona> list){
    
        
        for(int i = 0; i<list.size(); i++){
            
            Persona menor = list.get(i);
            Persona temp1 = list.get(i);
            
            for(int j = i+1; j<list.size(); j++){
            
                //Fecha de nacimiento de persona[j] es despues que la del menor.
                if(menor.getNacimiento().before(list.get(j).getNacimiento())){
                    menor = list.get(j);
                }
             
            }//for2
            
            
            Persona temp = menor;
            list.set(list.indexOf(menor), temp1);
            list.set(i,temp);
             
        }
    
    }//sort2
    
    protected static void seleccion(int[] a){
    
        for(int i = 0; i<a.length; i++){
            
            int menor = a[i];
            int temp1 = a[i];
            int index = i ;
            
            for(int j = i+1; j<a.length; j++){
            
                if(a[j] < menor){
                    menor = a[j];
                    index = j;
                }
             
            }//for2
            
            a[index] = temp1;
            a[i] = menor;
             
        }
    
    }//sort2
    
    protected static void seleccionNombres(ArrayList<Persona> list){
    
        for(int i = 0; i<list.size(); i++){
            
            String menor = list.get(i).getNombre();
            Persona temp1 = list.get(i);
            Persona temp = list.get(i);
            int index = i;
            
            for(int j = i+1; j<list.size(); j++){
            
                if(menor.compareTo(list.get(j).getNombre()) > 0){
                    menor = list.get(j).getNombre();
                    temp = list.get(j);
                    index = j;
                }
             
            }//for2
           
            
            list.set(index, temp1);
            list.set(i,temp);
             
        }
    
    }//sort2
    
    
    protected static ArrayList<Integer> insercion(ArrayList<Integer> nums){
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = nums.get(0);
        list.add(n);
        nums.remove(0);
        
        while(nums.size() > 0){    
        
            n = nums.get(0);
           
            int index = list.size();
            
            for(int j = 0; j<list.size(); j++){
                if(n < list.get(j)){
                  index = j;
                }
            }
                          
            list.add(index,n);
            nums.remove(0);
            
        }
        
        return list;
    }//insercion
    
    protected static void bubble(int[] n){
    
        for(int i = 0; i<n.length - 1; i++){
            
            for(int j = 0; j<n.length - i - 1; j++){
                
                if(n[j] > n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    
                }
                
            }
        }
        
    }//bubble
    
    protected static void reverseBubble(int[] n){
    
        for(int i = 0; i<n.length - 1; i++){
            
            for(int j = 0; j<n.length - i - 1; j++){
                
                if(n[j] < n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    
                }
                
            }
        }
        
    }//REVERSE BUBBLE
    
    
    protected static void partition(int[] arr, int low, int high){
    
        int median = medianOf3(arr,low,high);
        
    }//partition
    
    
    protected static void quicksort(int[] arr, int low, int high){
    
           
        
    }//QUICKSORT
    
    protected static void mergesort(int[] arr, int low, int high){
    
        if(low < high){
        
            int mid = (low+high)/2;
            
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
        
        
    }//MERGESORT
    
    // { 1, 6, 9, 3, 5, 8}
    protected static void merge(int[] arr, int low, int mid ,int high){
    
        
        
        
    }//MERGE
    
}
