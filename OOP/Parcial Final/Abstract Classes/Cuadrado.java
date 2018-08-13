public class Cuadrado extends Figura {

	private double x;
	private double y;

	public Cuadrado(String color, double x, double y){
		super(color);
		this.x = x;
		this.y = y;
	}

	@Override
	public double area(){
		return x*y;
	}

	@Override
	public double perimetro(){
		return (2*x) + (2*y)
	}

}//class