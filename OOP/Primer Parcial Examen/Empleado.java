public class Empleado{

	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private int numEmpleado;
	private int sueldo;

	Empleado(){
		this("Juanito","Progra","mador",0,10000);
	}

	Empleado(String nombre, String apellidoP, String apellidoM, int numEmpleado, int sueldo){
		if(numEmpleado < 0 || numEmpleado > 1000000) {
			System.out.println("El numero de empleado no esta dentro del rango, se le asignara uno por default");
			setNumEmp(0);
		}else{
			setNumEmp(numEmpleado);
		}

		setNombre(nombre);
		setApellidoP(apellidoP);
		setApellidoM(apellidoM);
		setNumEmp(numEmpleado);
		setSueldo(sueldo);
	}

	Empleado(String nombre, String apellidoP, String apellidoM, int numEmpleado){
		if(numEmpleado < 0 || numEmpleado > 1000000) {
			System.out.println("El numero de empleado no esta dentro del rango, se le asignara uno por default");
			setNumEmp(0);
		}

		setNombre(nombre);
		setApellidoP(apellidoP);
		setApellidoM(apellidoM);
	}

	// SETERS
	private void setNombre(String nombre){
		this.nombre = nombre;
	}

	private void setApellidoP(String apellidoP){
		this.apellidoP = apellidoP;
	}

	private void setApellidoM(String apellidoM){
		this.apellidoM = apellidoM;
	}

	private void setNumEmp(int numEmpleado){
		this.numEmpleado = numEmpleado;
	}

	private void setSueldo(int sueldo){
		this.sueldo = sueldo;
	}

	//GETERS

	public String getNombre(){
		return nombre;
	}

	public String getApellidoP(){
		return apellidoP;
	}

	public String getApellidoM(){
		return apellidoM;
	}

	public int getNumEmp(){
		return numEmpleado;
	}

	public int getSueldo(){
		return sueldo;
	}

	//METODOS

	public void compara(Empleado emp2){
		int sueldo1 = getSueldo();
		int sueldo2 = emp2.getSueldo();

		if(sueldo1 > sueldo2) {
			System.out.println(getNombre() + " tiene el mayor sueldo.");
		}
		else if (sueldo1 < sueldo2){
			System.out.println(emp2.getNombre() + " tiene el mayor sueldo.");
		}	
		else if (sueldo1 == sueldo2){
			System.out.println("Los sueldos de " + getNombre() + " y " + emp2.getNombre() + " son iguales.");
		}
	}//compara

	public String printData(){
		String temp = getNombre() + getApellidoP() + getApellidoP() + getNumEmp() + getSueldo();
		return temp;
	}

}//class