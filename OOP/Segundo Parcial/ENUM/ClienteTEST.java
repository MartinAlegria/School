import java.util.*;

public class ClienteTEST{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		char yes = 'y';
		char answer;
		int count = 0;
		TarjetaCredito tc;

		do{

		System.out.println("Bienvenido\n Ingrese su nombre:");
		String nombre = input.next();
		System.out.println("Ingrese su apellido:");
		String apellido = input.next();
		System.out.println("Ingrese su edad:");
		int edad = input.nextInt();

		Cliente client = new Cliente(1234, nombre, apellido, edad);
		System.out.println("Deseas asignar una tarjeta de credito ? [Y/N] ");
		answer = input.next().charAt(0);

		if(Character.toLowerCase(answer) == yes) {

		System.out.println("Numero ?"); //Hacerlo Random después
		String number = input.next();
		System.out.println("Limite de Credito ?");
		double saldo = input.nextDouble();
		System.out.println("Dia de Expedición ? [1-31]");
		int dia = input.nextInt();
		System.out.println("Mes de Expedición ? [1-12]");
		int mes = input.nextInt();
		System.out.println("Año de Expedición ? [XXXX]");
		int year = input.nextInt();
		
		System.out.println("Tipo de tarjeta de credito ? [Selecciona el numero de la opcion deseada]");
		System.out.println("1. CLASICA");
		System.out.println("2. ORO");
		System.out.println("3. PLATINUM");
		System.out.println("4. BLACK");

		int ansTipo = input.nextInt();

		switch(ansTipo){

			case 1:
			tc = new TarjetaCredito(number, saldo, dia, mes, year, dia, (mes + 5), (year + 5),tiposEnum.CLASICA);
			break;

			case 2:
			tc = new TarjetaCredito(number, saldo, dia, mes, year, dia, (mes + 5), (year + 5),tiposEnum.ORO);
			break;

			case 3:
			tc = new TarjetaCredito(number, saldo, dia, mes, year, dia, (mes + 5), (year + 5),tiposEnum.PLATINUM);
			break;

			case 4:
			tc = new TarjetaCredito(number, saldo, dia, mes, year, dia, (mes + 5), (year + 5),tiposEnum.BLACK);
			break;

			default:
			break;

		}
		lista.add(client);
		count++;
		System.out.println("Deseas agregar un nuevo cliente ? [Y/N]");
		answer = input.next().charAt(0);

		System.out.println();

		}//if

		for(int i = 0; i<lista.size(); i++ ){
			
			if(lista.get(i) != null) {
				lista.get(i).printCliente();
			}

		}

		}while(answer == yes);

/*
		//System.out.println();
		System.out.println("Bienvenido\n Ingrese su nombre:");
		String nombre = input.next();
		System.out.println("Ingrese su apellido:");
		String apellido = input.next();
		System.out.println("Ingrese su edad:");
		int edad = input.nextInt();

		Cliente c = new Cliente(1234, nombre, apellido, edad);

		System.out.println("Cuanto saldo tienes en tu Tarjeta de Credito ?");
		double saldo = input.nextDouble();
		System.out.println("En que dia la sacaste ? [1-31]");
		int dia = input.nextInt();
		System.out.println("En que mes la sacaste ? [1-12]");
		int mes = input.nextInt();
		System.out.println("En que año la sacaste ? [XXXX]");
		int year = input.nextInt();

		if (saldo <= 7500.00) {
			System.out.println("Tu saldo no es suficiente para poder crear una Tarjeta");
		}
		else if(saldo > 7500 && saldo <= 15000){
			TarjetaCredito tc = new TarjetaCredito("123456789", saldo, dia, mes, year, dia, (mes + 5), (year + 5));
			c.setTarjetaCredito(tc);
			System.out.println("/////////////////////////////////");
			c.printCliente();
			System.out.printf("Tipo de Tarjeta: CLASSICA\n");
			System.out.printf("Tu anualidad es $%f%n", tiposEnum.CLASICA.getA() );
			System.out.printf("Tu tasa de interes anual es %f%n", tiposEnum.CLASICA.tasaInteresAnual());
			System.out.printf("Tu tasa de interes mensual es %f%n", tiposEnum.CLASICA.tasaInteresMensual());
			System.out.println("/////////////////////////////////");
		}
		else if(saldo > 15000 && saldo <= 45000){
			TarjetaCredito tc = new TarjetaCredito("123456789", saldo, dia, mes, year, dia, (mes + 5), (year + 5));
			c.setTarjetaCredito(tc);
			System.out.println("/////////////////////////////////");
			c.printCliente();
			System.out.printf("Tipo de Tarjeta: ORO\n");
			System.out.printf("Tu anualidad es $%f%n", tiposEnum.ORO.getA() );
			System.out.printf("Tu tasa de interes anual es %f%n", tiposEnum.ORO.tasaInteresAnual());
			System.out.printf("Tu tasa de interes mensual es %f%n", tiposEnum.ORO.tasaInteresMensual());
			System.out.println("/////////////////////////////////");
		}
		else if (saldo > 45000 && saldo <= 100000){
			TarjetaCredito tc = new TarjetaCredito("123456789", saldo, dia, mes, year, dia, (mes + 5), (year + 5));
			c.setTarjetaCredito(tc);
			System.out.println("/////////////////////////////////");
			c.printCliente();
			System.out.printf("Tipo de Tarjeta: PLATINUM\n");
			System.out.printf("Tu anualidad es $%f%n", tiposEnum.PLATINUM.getA() );
			System.out.printf("Tu tasa de interes anual es %f%n", tiposEnum.PLATINUM.tasaInteresAnual());
			System.out.printf("Tu tasa de interes mensual es %f%n", tiposEnum.PLATINUM.tasaInteresMensual());
			System.out.println("/////////////////////////////////");
		}
		else{
			TarjetaCredito tc = new TarjetaCredito("123456789", saldo, dia, mes, year, dia, (mes + 5), (year + 5));
			c.setTarjetaCredito(tc);
			System.out.println("/////////////////////////////////");
			c.printCliente();
			System.out.printf("Tipo de Tarjeta: BLACK\n");
			System.out.printf("Tu anualidad es $%f%n", tiposEnum.BLACK.getA() );
			System.out.printf("Tu tasa de interes anual es %f%n", tiposEnum.BLACK.tasaInteresAnual());
			System.out.printf("Tu tasa de interes mensual es %f%n", tiposEnum.BLACK.tasaInteresMensual());
			System.out.println("/////////////////////////////////");
		}
*/

	}//main
}