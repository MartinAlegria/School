
import java.util.*;

class Song{

	private String name;
	private String artist;
	private int year;

	protected Song prev;
	protected Song next;

	Song(String name, String artist, int year){
		this.name = name;
		this.artist = artist;
		this.year = year;
	}

	@Override

	public String toString(){
		return name + " - " + artist + " - " + year;
	}

}//Song Class

class SongList{

	private String name;
	private Song head = null;

	SongList(String name){
		this.name = name;
	}

	public void setName(String str){
		this.name = str;
	}

	public void add(Song s){
		if(head == null){ //Set s to head
			head = s;
		}else{
			s.prev = end(); //Set the previous node of s to the end of the list
			end().next = s; //Get the last node on the list, set next to s
		}
	}

	public Song get(int i){
		Song temp = head;
		
		for(int x = 0; x<i; x++){
			temp = temp.next;
		}

		return temp;

	}

	public boolean remove(int i){
		if(i>= 0 && i<size()){
			Song temp = get(i);
			
			if(temp == head && size() == 1){
				head = null;
			}
			else if(temp == head){
				head = head.next;
				head.prev = null;
			}
			else if(temp == end()){
				temp = temp.prev;
				temp.next = null;
			}else{
				Song tempPrev = temp.prev;
				Song tempNext = temp.next;


				tempPrev.next = temp.next;
				tempNext.prev = temp.prev;
			}

			return true;
		}else{
			return false;
		}
	}

	public int size(){
		Song temp = head;
		int count = 0;

		while(temp.next != null){
			temp = temp.next;
			count++;
		}
		count++;

		return count;
	}

	public int indexOf(Song s){
		Song temp = head;
		int count = 0;

		while(temp != s && temp.next != null){
			temp = temp.next;
			count++;
		}

		return count;
	}

	public Song end(){
		if(head != null){

			Song temp = head;

			// Iterate thru the list, return the node that doesnt has a 'next' node
			while(temp.next != null){
				temp = temp.next;
			}

			return temp;

		}

		return head;
	}

	@Override
	public String toString(){
		if(head != null){
			String str = "";
			Song temp = head;

			for(int i = 0; i<size(); i++){
				str+= indexOf(temp) + ".- " + temp.toString() + "\n";
				temp = temp.next;
			}

			return str;
		}else{
			return "* Empty List *";
		}
	}

}//Song List


public class Playlist{


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Song s1 = new Song("BagBak", "Vince Staples", 2015);
		Song s2 = new Song("Wicked Games", "The Weeknd ", 2012);
		Song s3 = new Song("Renegade", "Styx", 1978);
		Song s4 = new Song("XO TOUR Llif3", "Lil Uzi Vert", 2017);
		Song s5 = new Song("Naive", "The Krooks", 2006);

		SongList playlist = new SongList("My Playlist");

		playlist.add(s1);
		playlist.add(s2);
		playlist.add(s3);
		playlist.add(s4);
		playlist.add(s5);

		int dec;

		do{
			menu(playlist);

			System.out.println("Type the number of your selection");
			dec = input.nextInt();

			switch(dec){

				case 1:
					break;

				case 2:
				System.out.println("Type the number of the song you want to remove");
				int song = input.nextInt();
				playlist.remove(song);
					break;

				case 3:
					break;

				case 4:
					break;

				case 5:
				System.exit(0);
					break;

			}

		}while(true);

	}

	public static void menu(SongList playlist){
		System.out.println(playlist.toString());
		System.out.println("1.- Add Song");
		System.out.println("2.- Remove Song");
		System.out.println("3.- Rename Playlist");
		System.out.println("4.- Play Song");
		System.out.println("5.- Exit");

	}

}//Playlist Class

