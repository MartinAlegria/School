import java.util.*;
public class Persona{

	private String nombre;
	private String apellido;
	Direccion dir;
	Fecha fecha;

	Persona(String nombre, String apellido, Direccion dir, Fecha fecha){
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha = fecha;
		this.dir = dir;
		this.fecha = fecha;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public void setDireccion(Direccion dir){
		this.dir = dir;
	}

	public void setFecha(Fecha fecha){
		this.fecha = fecha;
	}

	public String getNombre(){return nombre;}
	public String getApellido(){return apellido;}
	public Direccion getDireccion(){return dir;}
	public Fecha getFecha(){return fecha;}

	public boolean esMayorDeEdad(Fecha f){

		int diaNac = fecha.getDia();
		int mesNac = fecha.getMes();
		int yearNac = fecha.getYear();

		int diaAct = f.getDia();
		int mesAct = f.getMes();
		int yearAct = f.getYear();

		int dif = yearAct - yearNac;
		int difMes = mesAct - mesNac;
		int difDia = diaAct - diaNac;

		if(dif >= 18  /*&& difMes >= 0 && difDia >= 0*/){
			return true;
		}
		else{
			return false;
		}

	}//mayorEdad

	public String toString(){
		return "Nombre: " + getNombre() + " " + getApellido() + "\n" 
		 + "Fecha de Nacimiento: " + fecha.formatoFecha() + "\n"
		 + "Direccion: " + dir.formato();
	}

}

// 3 ABRIL 2018
// 4 ABRIL 2000