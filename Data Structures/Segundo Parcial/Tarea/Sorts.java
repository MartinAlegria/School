/*
    Martin Alegria
    A01022216
 */

import java.util.ArrayList;
import java.util.Arrays;


public class Sorts {

    protected static void intercambio(ArrayList<Persona> list){
        Persona temp;
        for(int i = 0; i<list.size(); i++){
            
            for(int j = i+1; j<list.size(); j++ ){
                
                if(list.get(i).getNacimiento() < list.get(j).getNacimiento()){
                    
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
                if(menor.getNacimiento() > list.get(j).getNacimiento()){
                    menor = list.get(j);
                }
             
            }//for2
            
            
            Persona temp = menor;
            list.set(list.indexOf(menor), temp1);
            list.set(i,temp);
             
        }
    
    }//sort2

    protected static void insercion(ArrayList<Persona> list){

        int n = list.size(); 
        for (int i=1; i<n; ++i){ 

            int key = list.get(i).getNacimiento(); 
            int j = i-1; 

            while (j>=0 && list.get(j).getNacimiento() > key){ 
                list.set(j+1, list.get(j));
                j = j-1; 
            } 
            key = list.get(j+1).getNacimiento(); 
        } 
    }//insercion


    protected static void bubble(ArrayList<Persona> list){
    
        for(int i = 0; i<list.size() - 1; i++){
            
            for(int j = 0; j<list.size() - i - 1; j++){
                
                //La fecha de J es antes que la de J+1 -> Es mayor
                if(list.get(j).getNacimiento()> list.get(j+1).getNacimiento()){

                    //SWAP
                    /*
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;*/

                    Persona temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                    
                }
                
            }
        }
        
    }//bubble



    protected static int partition(ArrayList<Persona> list, int low, int high){ 

        Persona pivot = list.get(high);  
        int i = (low-1);

        for (int j=low; j<high; j++){ 

            // If current element is smaller than or 
            // equal to pivot 
            
            if (list.get(j).getNacimiento() < pivot.getNacimiento()) {

                i++; 
                // swap arr[i] and arr[j]
                /* 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp;*/

                Persona temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j,temp); 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        /*int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp;*/

        Persona temp = list.get(i+1);
        list.set(i+1, list.get(high));
        list.set(high,temp);  
  
        return i+1; 

    }// PARTITION
    
    
    protected static void quicksort(ArrayList<Persona> list, int low, int high){
    
        if(low < high){
        
            int part = partition(list, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            quicksort(list, low, part-1); 
            quicksort(list, part+1, high);            
        
        }       
        
    }//QUICKSORT


    
    protected static void mergesort(Persona[] a, int low, int high){
    
        if(low < high){
        
            int mid = (low+high)/2;
            mergesort(a, low, mid);
            mergesort(a, mid+1, high);
            merge(a, low, mid, high);
        }
        
        
    }//MERGESORT
    
    protected static void merge(Persona[] a, int low, int mid ,int high){
        
        int elements = high - low + 1;
        Persona[] aux = new Persona[elements];
        int h = 0; // Índice del arreglo auxiliar
        int i = low; // Índice de la primera mitad
        int j = mid + 1; // Índice de la segunda mitad
        // Se recorren ambos subarreglos y se combinan sus elementos
        // hasta que se haya recorrido totalmente uno de ellos

        while ((i <= mid) && (j <= high)) {

            if (a[i].getNacimiento() <= a[j].getNacimiento()) {
                aux[h] = a[i];
                i += 1;
            } else {
                aux[h] = a[j];
                j+= 1;
            }
            h = h+1;
        }
        // Si se copiaron todos los elementos de la primera mitad,
        // se copia el resto de la segunda mitad
        if (i > mid){
            while (j <= high) {
                aux[h] = a[j];
                j += 1;
                h += 1;
            }
        }
        // Si no, se copia el resto de la primera mitad
        else{
            while (i <= mid) {
                aux[h] = a[i];
                i += 1;
                h = h+1;
            }

        }
        // Finalmente, se copia el contenido del arreglo auxiliar
        for (h = 0; h < elements; h++){
        a[low + h] = aux[h];
        }

    }//MERGE


}
