import java.util.*;

class Mano {

	private int num;
	protected Mano next;
	Random lol = new Random();

	Mano(){
		dedos();
	}

	public int dedos(){
		num = lol.nextInt(5) + 1;
		return num;
	}

	public int getDedos(){
		return num;
	}

	@Override
	public String toString(){
		return "Dedos: " + num;
	}


}//Mano Class

class ManoList{

	private Mano head = null;
	private Mano tail = null;

	public void add(Mano m){
		if(head == null){
			head = m;
			tail = m;
			tail.next = head;
		}else{
			end().next = m;
			tail = m;
			tail.next = head;
		}		
	}


	public Mano end(){
		if(head != null){

			Mano temp = head;

			// Traverse the list, return the node that is before the head;
			while(temp.next != head){
				temp = temp.next;
			}

			return temp;

		}

		return head;
	}

	public int size(){
		Mano temp = head;
		int count = 0;

		while(temp.next != head){
			temp = temp.next;
			count++;
		}
		count++;

		return count;
	}

	public int indexOf(Mano m){
		Mano temp = head;
		int count = 0;

		while(temp != m && temp.next != head){
			temp = temp.next;
			count++;
		}

		return count;
	}

	public int sum(Mano m){

		Mano temp = m;
		int count = 0;

		do{
			count += temp.getDedos();
			temp = temp.next;
		}while(temp != m);

		return count;
	}

	@Override
	public String toString(){
		if(head != null){
			String str = "";
			Mano temp = head;

			for(int i = 0; i<size(); i++){
				str+= indexOf(temp) + 1 + " - " + temp.toString() + "\n";
				temp = temp.next;
			}

			return str;
		}else{
			return "* Empty List *";
		}
	}

}//Mano List
º
class ParesNones{

	public static void main(String[] args) {

		/*

		PUEDE FUNCIONAR CON MÁS DE DOS JUGADORES

		Mano m1 = new Mano();
		Mano m2 = new Mano();
		Mano m3 = new Mano();
		Mano m4 = new Mano();

		ManoList list = new ManoList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);

		System.out.println(list.toString());
		System.out.println(list.sum(m2));

		*/

		Scanner input = new Scanner(System.in);
		System.out.println("Cual es el nombre del primer jugador ?");
		String nombre1 = input.next();
		Mano m1 = new Mano();
		System.out.println("Cual es el nombre del segundo jugador ?");
		String nombre2 = input.next();
		Mano m2 = new Mano();

		ManoList list = new ManoList();
		list.add(m1);
		list.add(m2);

		Random lol = new Random();
		int turno = lol.nextInt(2) + 1;

		if(turno == 1) {
		 	System.out.println("El turno es de "  + nombre1);
		 	System.out.println("Cual es tu prediccion " + nombre1 + " ? [1 == NON, 2 == PAR]");
			int pred = input.nextInt();
			System.out.println(list.sum(m1));

			if(((list.sum(m1) % 2) == 0 && pred == 2)|| ((list.sum(m1) % 2) == 1 && pred == 1 )) {
				System.out.println("CORRECTO!! El ganador es: " + nombre1 + "!");
			}else{
				System.out.println("INCORRECTO!! El ganador es: " + nombre2 + "!");
			}

		 }else{
			System.out.println("El turno es de "  + nombre2);
			System.out.println("Cual es tu prediccion " + nombre2 + " ? [1 == NON, 2 == PAR]");
			int pred = input.nextInt();	
			System.out.println(list.sum(m2));

			if(((list.sum(m2) % 2) == 0 && pred == 2)|| ((list.sum(m2) % 2) == 1 && pred == 1 )) {
				System.out.println("CORRECTO!! El ganador es: " + nombre2 + "!");
			}else{
				System.out.println("INCORRECTO!! El ganador es: " + nombre1 + "!");
			}

		 }

	}

	
}