
public class Semaforo{

	Lampara rojo;
	Lampara amar;
	Lampara verde;

	Semaforo(Lampara rojo, Lampara amar, Lampara verde){
		this.rojo = rojo;
		this.amar = amar;
		this.verde = verde;		
	}

	public void changeGreen(){
		rojo.turnOff();
		amar.turnOff();
		verde.turnOn();
	}

	public void changeRed(){
		rojo.turnOn();
		amar.turnOff();
		verde.turnOff();
	}

    public String printStatus(){
	return "\nGreen: " + "\t" + verde.lightStatus() + "\nYellow: " + amar.lightStatus() +"\nRed: " + "\t" + rojo.lightStatus();
    }

}//class