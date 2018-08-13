public class Persona {

	private String nombre, apellido, alias;
	private int edad;


	Persona(){
		this("","","",0);
	}


	Persona(String nombre, String apellido, String alias, int edad){

		setNombre(nombre);
		setApellido(apellido);
		setAlias(alias);
		setEdad(edad);

	}

	//SETERS

	private void setNombre(String nombre){
		this.nombre = nombre;
	}

	private void setApellido(String apellido){
		this.apellido = apellido;
	}

	private void setAlias(String alias){
		this.alias = alias;

	}

	private void setEdad(int edad){
		this.edad = edad;
	}

	//GETERS

	public String getNombre(){
		return nombre;
	}

	public String getApellido(){
		return apellido;
	}

	public String getAlias(){
		return alias;
	}

	public int getEdad(){
		return edad;
	}

	//METODOS

	public void modData(String nombre, String apellido, String alias, int edad){
		setNombre(nombre);
		setApellido(apellido);
		setAlias(alias);
		setEdad(edad);

	}

	public void printPersona(){
		System.out.println("Cliente: " + getNombre()+ " " + getApellido() + "\n" + "Edad: " + getEdad() + "\n" + "Alias: " + getAlias());
	}


}//class