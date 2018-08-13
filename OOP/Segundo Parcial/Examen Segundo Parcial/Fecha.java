public class Fecha{
	private int dia;
	private int mes;
	private int year;

	Fecha(int dia, int mes, int year){
		this.dia = dia;
		this.mes = mes;
		this.year = year;
	}

	private void setDia(int dia){
		this.dia = dia;
	}

	private void setMes(int mes){
		this.mes = mes;
	}

	private void setYear(int year){
		this.year = year;
	}

	public int getDia(){
		return dia;
	}

	public int getMes(){
		return mes;
	}

	public int getYear(){
		return year;
	}

	public String formatoFecha(){
		return String.format("%d/%2d/%d", dia, mes, year);
	}


}