public class Punto{

	protected int x;
	protected int y;

	Punto(int x, int y){
		this.x = x;
		this.y = y;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getX(){return x;}
	public int getY(){return y;}

	public void print(){
		System.out.println(x  + " " + y);
	}
}