import java.util.*;
public class Main{

	public static void main(String[] args) {
		int mayorEdad = 0;
		Fecha fAct = new Fecha(3,4,2018);

		Fecha fNac1 = new Fecha(11,2,1999);
		Fecha fNac2 = new Fecha(2,3,1970);
		Fecha fNac3 = new Fecha(15,9,1996);

		Direccion dir1 = new Direccion("Av Java" , 237, 1987, "CDMX");
		Direccion dir2 = new Direccion("Av Python" , 987, 4567, "Puebla");
		Direccion dir3 = new Direccion("Av C++" , 908, 8967, "Monterrey");

		Persona per1 = new Persona("Martin", "Alegria", dir1, fNac1);
		Persona per2 = new Persona("Diego", "Moreno", dir2, fNac2);
		Persona per3 = new Persona("Christopher", "Cejudo", dir3, fNac3);
	
		ArrayList<Persona> personaList = new ArrayList<Persona>();
		personaList.add(per1);
		personaList.add(per2);
		personaList.add(per3);

		for (int i = 0;i<personaList.size() ;i++ ) {
			System.out.println();
			System.out.println(personaList.get(i).toString());
			System.out.println();
			boolean mE = personaList.get(i).esMayorDeEdad(fAct); 
			if(mE) {
				mayorEdad++;
			}
		}

		System.out.println("Hay "+ mayorEdad + " personas mayores edad en esta lista");
	}

}