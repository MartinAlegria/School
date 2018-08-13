import java.util.*;

public class Cliente{

	public static void main(String[] args) {
		Fecha currentf;
		Fecha f;
		ArrayList<Vehiculo> almacen = new ArrayList<Vehiculo>();

		currentf = new Fecha(10,5,2018);

		Moto moto1 = new Moto("Harley", "A0001", 1, 5000, 40, 2010, true);
		moto1.setFecha(f = new Fecha(10,4,2018)); 
		Moto moto2 = new Moto("Suzuki", "A0002", 2, 4000, 60, 2014, false);
		//marca,matricula,id,numKm,gasolina,year, renta

		Furgoneta furg1 = new Furgoneta("Ford", "A0003", 3, 13000, 60, 2017, true, 400, 2.0);
		furg1.setFecha(f = new Fecha(20,2,2018)); 
		Furgoneta furg2 = new Furgoneta("VW",   "A0004", 4, 20000, 50, 2013, false, 500, 2.3);
		//String marca, String matricula, int id, int numKm, double gasolina, int year, boolean renta, int capacidadCarga, int altura

		Deportivo dep1 = new Deportivo("Ferrari", "A0005", 5, 11000, 45, 2013, true, 90, true, 3, 4);
		dep1.setFecha(f = new Fecha(13,4,2018)); 
		Deportivo dep2 = new Deportivo("Masserati", "A0006", 6, 12000, 75, 2012, true, 90, false, 2, 2);
		dep2.setFecha(f = new Fecha(14,3,2018)); 
		//String marca, String matricula, int id, int numKm, double gasolina, int year, boolean renta, double capacidadMotor, boolean turbo, int puertas, int asientos

		almacen.add(moto1);
		almacen.add(moto2);

		almacen.add(furg1);
		almacen.add(furg2);

		almacen.add(dep1);
		almacen.add(dep2);

		

		System.out.println("-----------------------------------");
		System.out.println("ALMACEN:");
		for(int i = 0; i<almacen.size() ; i++) {
			System.out.println(almacen.get(i).toString());
		}

		System.out.println("-----------------------------------");
		System.out.println("ALQUILADOS: ");
		for(int i = 0; i<almacen.size() ; i++) {
			
			if(almacen.get(i).getAl()) {
				System.out.println(almacen.get(i).basicPrint() + "\n\t COSTO ALQUILER: " + almacen.get(i).costoAlquiler(currentf, currentf.year)+ "\n\t DIAS RENTADO: " + almacen.get(i).diasRentado(currentf));
				System.out.println("*******");
			}

		}





	}//main

}