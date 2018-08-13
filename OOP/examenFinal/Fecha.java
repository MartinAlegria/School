public class Fecha{

	public int dia;
	public int mes;
	public int year;
	
	Fecha(int dia, int mes, int year){
		this.dia = dia;
		this.mes = mes;
		this.year = year;
	}

	public int differencia(Fecha f){

		int difMes = mes - f.mes;

		int difDias = dia - f.dia;

		return difDias + (difMes*30);

	}

}