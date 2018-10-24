/*
    Martin Alegría
    A01022216
 */
package sorts;

import java.util.Date;



public class Persona {
 
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private String telefono;
    
    Persona(String nombre, String apellido, Date nacimiento, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
    return nombre + " " + apellido + "\n" + nacimiento.getDate() + "/" + nacimiento.getMonth()+ "/" + nacimiento.getYear() + "\n" + telefono + "\n";
    }
    
    
}
