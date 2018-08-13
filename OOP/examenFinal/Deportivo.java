public class Deportivo extends Vehiculo{

	protected double capacidadMotor;
	protected boolean turbo;
	protected int puertas;
	protected int asientos;

	protected int costoBase = 2500;
	public Fecha f;

	Deportivo(String marca, String matricula, int id, int numKm, double gasolina, int year, boolean renta, double capacidadMotor, boolean turbo, int puertas, int asientos){
		super(marca,matricula,id,numKm,gasolina,year,renta);
		this.capacidadMotor = capacidadMotor;
		this.turbo = turbo;
		this.puertas = puertas;
		this.asientos = asientos;
	}

	public void setFecha(Fecha f){
		this.f = f;
	}


	public int costoAlquiler(Fecha fecha, int anio){
		int dias = fecha.differencia(f);
		int yearDif = anio - year;
		int gasAdd = (int)(gasolina * 20);
		int resultado = 0;
		int base = costoBase * dias;
		int ant =  yearDif * 100;

		resultado = base - year;
		resultado += gasAdd;

		if (resultado<1500) {
			resultado = 1500;
		}

	 	return (resultado);
	 }//costoAlquiler

	 @Override
	 public String toString(){
	 	String t, r;
	 	if (turbo) {
	 		t = "Si";
	 	}else{
	 		t = "No";
	 	}

	 	if (renta) {
	 		r = "Si";
	 	}else{
	 		r = "No";
	 	}

	 	return "\nMarca: " + marca + "\nMatricula: " + matricula + "\nID: "+ id + "\n #KM: " + numKm + "km"+ "\nGas: " + gasolina + "l" + "\nAño: " + year + "\nCapacidad Motor: "+ capacidadMotor + "\nTurbo: " + t + "\nPuertas: " + puertas + "\nAsientos: "+ asientos + "\nEsta rentado ?:" + r;
	 }

	 public int diasRentado(Fecha fecha){
		return fecha.differencia(f);
	}

}