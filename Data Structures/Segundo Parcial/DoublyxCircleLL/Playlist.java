
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

	public String getName(){return name;}
	public String getArtist(){return artist;}

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

	public String getName(){
		return name;
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
				str+= indexOf(temp) + 1 + ".- " + temp.toString() + "\n";
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
		boolean playing = false;
		Song currentPlay = null;

		do{
			menu(playlist, playing, currentPlay);
			System.out.println("Type the number of your selection");
			dec = input.nextInt();

			switch(dec){

				case 1: //ADD SONG
					input.nextLine();
					String n, a;
					int y;
					System.out.println("What's the name of the Song ?");
					n = input.nextLine();
					System.out.println("What's the name of the Artist ?");
					a = input.nextLine();
					System.out.println("In what year was the song released ?");
					y = input.nextInt();

					Song ns = new Song(n,a,y);
					playlist.add(ns);

					break;

				case 2: //REMOVE SONG
					System.out.println("Type the number of the song you want to remove");
					int song = input.nextInt();
					playlist.remove(song-1);
					System.out.println();
					break;

				case 3: //RENAME PLAYLIST

					input.nextLine();
					String name;
					System.out.println("What's the new name of the playlist ?");
					name = input.nextLine();
					playlist.setName(name);

					break;

				case 4: //PLAY SONG

					int i;
					System.out.println("Type the number of the song you want to play:");
					i = input.nextInt();
					playing = true;
					currentPlay = playlist.get(i-1);
					break;

				case 5: //NEXT SONG

					if(currentPlay.next == null){ //THERE ISN'T A SONG CURRENTLY Playing
						currentPlay = playlist.get(0);
					}else{
						currentPlay = currentPlay.next;
					}

					break;

				case 6://PREVIOUS SONG

					if(currentPlay.prev == null){ //THERE ISN'T A SONG CURRENTLY Playing
						currentPlay = playlist.get(playlist.size() - 1);
					}else{
						currentPlay = currentPlay.prev;
					}

					break;

				case 7: //EXIT
					System.exit(0);
					break;

			}


		}while(true);

	}

	public static void menu(SongList playlist, boolean playing, Song currentPlay){
		System.out.println("----------------------------------------");
		System.out.println("\t       " + playlist.getName());
		System.out.println("----------------------------------------");
		System.out.println(playlist.toString());
		System.out.println("----------------------------------------");
		System.out.println("1.- Add Song");
		System.out.println("2.- Remove Song");
		System.out.println("3.- Rename Playlist");
		System.out.println("4.- Play Song");
		if(playing) {
			System.out.println("5.- Next Song");
			System.out.println("6.- Previous Song");
		}
		System.out.println("7.- Exit");
		System.out.println("----------------------------------------");
		if(playing) 
				System.out.println("** Now Playing '"+  currentPlay.getName() + "' by " + currentPlay.getArtist() + " **");

	}

}//Playlist Class

