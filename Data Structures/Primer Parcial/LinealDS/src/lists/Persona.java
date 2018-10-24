/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author mav
 */
public class Persona {
    
    private int nacimiento;
    private String nombre;
    private Persona siguiente;

    public int getNacimiento() {
        return nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getSiguiente() {
        return siguiente;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSiguiente(Persona siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
