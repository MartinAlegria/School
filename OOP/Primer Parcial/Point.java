import java.lang.*;

public class Point{
	
	//VARIABLES
	private int x;
	private int y;

	//CONSTRUCTORES
	Point(){
		this(0,0);
	}

	Point(int x, int y){
		setX(x);
		setY(y);
	}

	//SETERS
	private void setX(int x){
		this.x = x;
	}

	private void setY(int y){
		this.y= y;
	}

	//GETERS
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	//METHODS

	public void distancia(Point op){

		double distancia = 0.0;
		double x2 = op.getX();
		double y2 = op.getY();

		double difY = 0.0;
		double difX = 0.0;

		if(x2 > x) {
			difX = x2 - x;
		}else{
			difX = x - x2;
		}

		if(y2 > y) {
			difY = y2 - y;
		}else{
			difY = y - y2;
		}


		distancia =  Math.sqrt(  Math.pow(difX, 2) +  Math.pow(difY, 2));
		System.out.println(distancia);
	}

}