public class Furgoneta extends Vehiculo{

	protected int capacidadCarga;
	protected double altura;

	private int costoBase = 2000;

	public Fecha f;

	Furgoneta(String marca, String matricula, int id, int numKm, double gasolina, int year, boolean renta, int capacidadCarga, double altura){
		super(marca,matricula,id,numKm,gasolina,year,renta);
		this.capacidadCarga = capacidadCarga;
		this.altura = altura;
	}




	public int costoAlquiler(Fecha fecha, int anio){

		int dias = fecha.differencia(f);
		int yearDif = anio - year;
		int resultado = 0;
		int base = costoBase * dias;
		int ant = yearDif* 100;

		resultado = base - ant;
		int gasAdd = (int)(gasolina * 20);
		resultado += gasAdd;

		if(resultado < 1000) {
			resultado = 1000;
		}
	 	return resultado;
	 }//costoAlquiler

	 @Override
	 public String toString(){
	 	String r;

	 	if (renta) {
	 		r = "Si";
	 	}else{
	 		r = "No";
	 	}

	 	return "\nMarca: " + marca + "\nMatricula: " + matricula + "\nID: "+ id + "\n #KM: " + numKm + "km"+ "\nGas: " + gasolina + "l" + "\nAño: " + year + "\nCapacidad Carga: "+ capacidadCarga + "\nAltura: "+ altura + "\nEsta rentado ?:" + r;

	 }

	 public void setFecha(Fecha f){
		this.f = f;
	}

	public int diasRentado(Fecha fecha){
		return fecha.differencia(f);
	}

	 //Furgoneta(String marca, String matricula, int id, int numKm, double gasolina, int year, boolean renta, int capacidadCarga, float altura

}