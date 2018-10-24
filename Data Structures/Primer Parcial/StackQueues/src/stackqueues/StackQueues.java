/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

/**
 *
 * @author mav
 */
public class StackQueues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        
        stack.push("Hola");
        stack.push("Que");
        stack.push("Facil");
        
        System.out.println(stack.toString());
    }
    
}
