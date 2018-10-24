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
public interface iStack {
    
    public boolean push(Object o);
    
    public Object pop();
    
    public boolean empty();
    
    public Object peek();
    
    public void clear();
    
}
