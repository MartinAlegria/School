public class Nomina{

	public static void main(String[] args) {
		Salario sal = new Salario(6500);
		Empleado emp = new Empleado("Martin", "Alegria", 0001, sal);

		System.out.println(emp.toString());
	}

}