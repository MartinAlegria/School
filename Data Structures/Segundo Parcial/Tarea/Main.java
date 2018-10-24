
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    
    
    public static void main(String[] args){

     
      ArrayList<Persona> list = new ArrayList<Persona>();
      inicializarPersonas(list);

      //INTERCAMBIO
      /*
      long startTime = System.nanoTime();
      Sorts.intercambio(list);
      long endTime   = System.nanoTime();
      long totalTime = endTime - startTime;
      printPersonas(list);*/


      //SELECCION
      /*
      long startTime = System.nanoTime();
      Sorts.seleccion(list);
      long endTime   = System.nanoTime();
      long totalTime = endTime - startTime;
      printPersonas(list);*/

      //INSERCION
      /*
      long startTime = System.nanoTime();
      Sorts.insercion(list);
      long endTime   = System.nanoTime();
      long totalTime = endTime - startTime;
      printPersonas(list);*/

      //BUBBLE SORT
      /*
      long startTime = System.nanoTime();
      Sorts.bubble(list);
      long endTime   = System.nanoTime();
      long totalTime = endTime - startTime;
      printPersonas(list);*/

      //QUICKSORT
      /*
      long startTime = System.nanoTime();
      Sorts.quicksort(list, 0, list.size()-1);
      long endTime   = System.nanoTime();
      long totalTime = endTime - startTime;
      printPersonas(list);*/

      //MERGESORT
      long startTime = System.nanoTime();
      
      Persona[] pers = list.toArray(new Persona[list.size()]);

      Sorts.mergesort(pers, 0, pers.length -1);
      long endTime   = System.nanoTime();
      long totalTime = endTime - startTime;
      printPersonas(pers);

      System.out.println("Run time: " + totalTime);

      //


    }//Main  
    
    public static void inicializarPersonas(ArrayList<Persona> list){

      for (int i = 0; i<=1000; i++) {
        
        int year = new Random().nextInt(98 + 1)  + 1920;
        list.add(new Persona("ada", "asdasd",year));

      }

    }

    public static void printPersonas(ArrayList<Persona> list){

      for (int i = 0; i<=1000; i++) {
        
        System.out.print(i + ".-" + "\t" + list.get(i).toString());

      }

    }

    public static void printPersonas(Persona[] p){

      System.out.print("SIN");
      for (int i = 0; i<=1000; i++) {
        
        System.out.print(i + ".-" + "\t" + p[i].toString());

      }

    }



}
