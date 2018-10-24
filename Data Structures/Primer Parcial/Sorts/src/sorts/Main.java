/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author mav
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Main m = new Main();
        int[] lol = {6,14,12,4,2,0};
        
        ArrayList<Persona> list = m.inicializaLista();
        m.imprimeLista(list);
        
        ArrayList<Integer> numeros = m.inicializaNumeros();
        
        System.out.println("------------------------------- \n intercambio");
        
        Sorts.intercambio(list);       
        m.imprimeLista(list);
        
        System.out.println("------------------------------- \n SELECCION");
        list = m.inicializaLista();
        Sorts.seleccion(list);
         m.imprimeLista(list);
         
         System.out.println("------------------------------- \n SELECCION Numeros");
         Sorts.seleccion(lol);
         System.out.println(Arrays.toString(lol));
        
         System.out.println("------------------------------- \n SELECCION Nombres");
         list = m.inicializaLista();
        Sorts.seleccionNombres(list);
         m.imprimeLista(list);
         
          System.out.println("------------------------------- \n INSERCION NUMEROS");
          System.out.println("Before: " + Arrays.toString(numeros.toArray()));
          numeros = m.inicializaNumeros();
          numeros = Sorts.insercion(numeros);
          System.out.println("After: " + Arrays.toString(numeros.toArray()));
          
          System.out.println("------------------------------- \n BUBBLE NUMEROS");
          
          int[] lel = {6,14,12,4,2,0};
           System.out.println("Before: " + Arrays.toString(lel));
           Sorts.bubble(lel);
           System.out.println("After: " + Arrays.toString(lel));
           
           System.out.println("------------------------------- \n REVERSE BUBBLE NUMEROS");
          
          int[] lal = {6,14,12,4,2,0};
           System.out.println("Before: " + Arrays.toString(lal));
           Sorts.reverseBubble(lal);
           System.out.println("After: " + Arrays.toString(lal));
        
        
    }
    
    private ArrayList<Persona> inicializaLista(){
        ArrayList<Persona> list = new ArrayList<Persona>();
        
        Date nac1 = new Date(1999,2,11);
        Date nac2 = new Date(1994,3,8);
        Date nac3 = new Date(1999,4,21);
        Date nac4 = new Date(2000,6,19);
        Persona io = new Persona("Martin", "Alegria", nac1, "5599887733");
        Persona megu = new Persona("Megumi", "Kimura", nac2, "9988776655");
        Persona cris = new Persona("Cris", "Cejudo", nac3, "1122334455");
        Persona rand = new Persona("X", "Y", nac4, "111222233");
        
        list.add(io);
        list.add(megu);
        list.add(cris);
        list.add(rand);
        
        return list;
    }
    
    private void imprimeLista(ArrayList<Persona> list){
        
        for(Persona a: list){
            System.out.println(a.toString());
        }
        
    }
    

    private ArrayList<Integer> inicializaNumeros() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(8);
        list.add(12);
        
        return list;
        
    }
    
    
    
    
    
}
