import java.util.*;

public class EmpleadoTEST{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Empleado emp1 = new Empleado();	
		Empleado emp2 = new Empleado();

		System.out.println("Bienvenido\nPrimero que nada, quiere asignar los salarios de los empleados ? [y/n]");
		String dec = input.next();

		if(dec.equalsIgnoreCase("y")) {

			for(int i = 0; i<2 ; i++ ) {
			
				System.out.println("Cual es el nombre del empleado " + (i+1));
				String nombre = input.next();
				System.out.println("Cual es su apellido paterno ?");
				String apelidoP = input.next();
				System.out.println("Cual es su apellido materno ?");
				String apellidoM = input.next();
				System.out.println("Cual es su numero de empleado ?");
				int numEmp = input.nextInt();
				System.out.println("Cual es su salario ?");
				int salario = input.nextInt();

				if(i == 0) {
					emp1 = new Empleado(nombre,apelidoP,apellidoM,numEmp,salario);
				}else{
					emp2 = new Empleado(nombre,apelidoP,apellidoM,numEmp,salario);
				}

			}

		}else{

			for(int i = 0; i<2 ; i++ ) {
			
				System.out.println("Cual es el nombre del empleado " + (i+1));
				String nombre = input.next();
				System.out.println("Cual es su apellido paterno ?");
				String apelidoP = input.next();
				System.out.println("Cual es su apellido materno ?");
				String apellidoM = input.next();
				System.out.println("Cual es su numero de empleado ?");
				int numEmp = input.nextInt();

				if(i == 0) {
					emp1 = new Empleado(nombre,apelidoP,apellidoM,numEmp);
				}else{
					emp2 = new Empleado(nombre,apelidoP,apellidoM,numEmp);
				}

			}

		}

		emp1.compara(emp2);


	}//main

}//class