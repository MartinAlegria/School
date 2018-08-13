public abstract class Vehiculo{
	
	protected String marca;
	protected String matricula;
	protected int id;
	protected int numKm;
	protected double gasolina; //En litros
	protected int year;
	protected boolean renta;

	Vehiculo(String marca, String matricula, int id, int numKm, double gasolina, int year, boolean renta){
		this.marca = marca;
		this.matricula = matricula;
		this.id = id;
		this.numKm = numKm;
		this.gasolina = gasolina;
		this.year = year;
		this.renta = renta;
	}

	abstract public int costoAlquiler(Fecha fecha, int anio);

	public boolean getAl(){return renta;}

	public String basicPrint(){
		return marca + "\n" + matricula + "\n" + id + "\n" + year;
	}

	abstract public int diasRentado(Fecha fecha);


}