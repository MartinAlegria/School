public class Distancia{

	//VARIABLES
	private int initX;
	private int velocity;

	//CONSTRUCTOR
	Distancia(){
		this(0,0);
	}
	Distancia(int initX, int velocity){
		setInitX(initX);
		setVelocity(velocity);
	}

	//SETTERS
	private void setInitX(int initX){
		this.initX = initX;
	}

	private void setVelocity(int velocity){
		this.velocity = velocity;
	}

	//GETTERS

	public int getInitX(){
		return initX;
	}

	public int getVelocity(){
		return velocity;
	}

	//METHODS

	public void modData(int initX, int velocity){
		setInitX(initX);
		setVelocity(velocity);
	}



}//class