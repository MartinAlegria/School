/*
    Martin Alegría
    A01022216
 */

public class Persona {
 
    private String nombre;
    private String apellido;
    private int nacimiento;
    private String telefono;
    
    Persona(String nombre, String apellido, int nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNacimiento() {
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

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
    return nombre + " " + apellido + "\t Año de Nacimiento: " + nacimiento + "\n";
    }
    
    
}
