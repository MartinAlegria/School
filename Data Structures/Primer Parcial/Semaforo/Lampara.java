public class Lampara{

	private boolean isOn;
	private String color;
	private int intensidad;

	Lampara(boolean isOn, String color, int intensidad){
		this.isOn = isOn;
		this.color = color;
		this.intensidad = intensidad;
	}

	public void turnOn(){
		if (!isOn) isOn = true;
	}

	public void turnOff(){
		if(isOn) isOn = false;
	}

	public void setIntensidad(int intensidad){
		this.intensidad = intensidad;
	}

	public void setColor(String color){
		this.color = color;
	}

	public boolean isItOn(){
		return isOn;
	}

	public String lightStatus(){
		if(isOn) {
			return "*";
		}
		else{
			return "O";
		}
	}


}//class