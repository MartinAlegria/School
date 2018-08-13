public class Moto extends Vehiculo{

	private int costoBase = 800;

	public Fecha f;
	

	Moto(String marca, String matricula, int id, int numKm, double gasolina, int year, boolean renta){
		super(marca,matricula,id,numKm,gasolina,year, renta);
	}

	 public int costoAlquiler(Fecha fecha, int anio){
	 		int dias = fecha.differencia(f);
	 	return (dias*costoBase);
	 }//costoAlquiler

	 @Override
	 public String toString(){
	 	String r;

	 	if (renta) {
	 		r = "Si";
	 	}else{
	 		r = "No";
	 	}

	 	return "\nMarca: " + marca + "\nMatricula: " + matricula + "\nID: "+ id + "\n #KM: " + numKm + "km"+ "\nGas: " + gasolina + "l" + "\nAño: " + year + "\nEsta rentado ?:" + r;
	 }

	 public void setFecha(Fecha f){
		this.f = f;
	}

	public int diasRentado(Fecha fecha){
		return fecha.differencia(f);
	}

}