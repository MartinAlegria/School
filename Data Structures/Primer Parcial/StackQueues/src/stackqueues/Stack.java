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
public class Stack implements iStack{

    private static final int TAM_MAX = 6;
    private int tope;
    private Object[] elem;
    
    public Stack(){
        tope = TAM_MAX;
        elem = new Object[TAM_MAX];
    }
    
    @Override
    public boolean push(Object o) {
        if(tope == 0){
            return false;
        }
        
        tope--;
        elem[tope] = o;
        return true;
    }

    @Override
    public Object pop() {
        if(empty()){
        return false;
        }
        
        tope ++;
        return elem[tope-1];
    }

    @Override
    public boolean empty() {
        return tope == TAM_MAX;
    }

    @Override
    public Object peek() {
        if(empty()){
            return null;
        }
        
        return elem[tope];
        
    }

    @Override
    public void clear() {
        tope = TAM_MAX;
        elem = new Object[TAM_MAX];
    }

    @Override
    public String toString() {
        String str = "";
        
        for(Object o: elem){
            str += o;
        }
        
        return str;
    }
   
    
}
