public class MainCirculo{


	public static void main(String[] args) {
		Circulo c = new Circulo(5,1,2);
		//Punto p = new Punto(1,2);

		System.out.println("Radio: "
		+ c.getRadio()
		+ "\nDiametro: " + c.getDiametro()
		+ "\nCircunferencia: " + c.getCircunferencia()
		+ "\nArea: " + c.getArea());

		c.Centro();
	}

}