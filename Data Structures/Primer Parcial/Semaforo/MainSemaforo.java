import java.util.*;

public class MainSemaforo{

    static int l = 0;
    static Lampara rojo = new Lampara(false, "rojo", 5);
	static Lampara amar = new Lampara(false, "amar", 5);
	static Lampara verde = new Lampara(false, "verde", 5);
	static Semaforo semaforo = new Semaforo(rojo, amar, verde);
    
    public static void main(String[] args){



	changes();
	if(l == 10) {
		System.exit(0);
	}


    }//Main


    public static void changes(){

	Timer timer = new Timer();

	TimerTask task = new TimerTask(){

		

		@Override
		    public void run(){

		    if(l%2 == 0){
			semaforo.changeGreen();
		    }//if   
		    else{
			semaforo.changeRed();
		    }//else

		    System.out.println(semaforo.printStatus());
		    l++;

		    if (l==10) {
	         timer.cancel();
	         timer.purge();
	         return;
     		}

		}//run
	    
	    };//Timertask

	timer.schedule(task,0,5000);


    }//changes


}