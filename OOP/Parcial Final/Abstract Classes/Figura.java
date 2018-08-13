public abstract class Figura{

	protected String color;

	public Figura(String color){
		this.color = color;
	}

	abstract double area();
	abstract double perimetro();

	public String getColor(){
		return color;
	}

}//clase