public class Circulo extends Punto{

	public int radio;

	Circulo(int radio, int x, int y){
		super(x,y);
		this.radio = radio;
		
	}

	public int getRadio(){
		return radio;
	}

	public int getDiametro(){
		return 2* radio;
	}	

	public double getCircunferencia(){
		return (double)getDiametro() * 3.1416;
	}

	public double getArea(){
		return 3.1416 * (double)(radio*radio);
	}

	public void Centro(){
		super.print();
		System.out.println(radio);
	}

}
