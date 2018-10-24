public class Empleado{

	private String nombre;
	private String apell;
	private int num;
	Salario sal;

	Empleado(String nombre, String apell, int num, Salario sal){
		this.nombre = nombre;
		this.apell = apell;
		this.num = num;
		this.sal = sal;
	}

	public double getSalario(){
		return sal.getNeto();

	}

	public int getNum(){
		return num;
	}

	@Override
	public String toString(){
		
		return nombre + " "  + apell + "\nID: " + num + "\nSalario Base: $" + sal.getSal() + "\nRetenciones: $" + sal.tax() + "\nSalario Neto: $"+ sal.getNeto();
	}

}