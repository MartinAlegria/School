import java.util.Scanner;

public class Scrabble{

	public static void main(String[] args) {
		String[] Scrabble = {"Aba","Abc","Aca","Achi","Achu","Aes","Aga","Ahe","Ahi","Aho","Aja","Aje","Aji","Ajo","Ala","Ale","Ali","Alla","Alli","Ama","Ame","Ami","Amo","Ana","Ano","Ana","Ano","Apa","Api","Ara","Are","Aro","Arra","Arre","Asa","Ase","Asi","Aso","Ata","Ate","Ato","Aun","Ave","Avo","Aya","Ayo","Azo","Bah","Bao","Bar","Bel","Ben","Bes","Bey","Bio","Bis","Bit","Bla","Ble","Boa","Boj","Bol","Bon","Bou","Box","Boy","Bua","Bue","Bum","Bus","Buz","Cae","Cai","Cal","Can","Cao","Cap","Car","Cas","Cay","Caz","Cea","Ceo","Ces","Cia","Cid","Cie","Cio","Clo","Coa","Col","Con","Cor","Coy","Coz","Cui","Cus","Cuy","Cuz","Chai","Chal","Chan","Chao","Chas","Chat","Chau","Chef","Ches","Chia","Chic","Chie","Chii","Chin","Chio","Chip","Chis","Chop","Choz","Chua","Chuj","Chus","Chut","Chuz","Dad","Dan","Dar","Das","Dea","Del","Den","Des","Dey","Dia","Dij","Din","Dio","Diu","Dix","Dom","Don","Dos","Doy","Dua","Duo","Dux","Duz","Eco","Ecu","Echa","Eche","Echo","Ees","Efe","Ego","Eje","Ele","Ella","Elle","Ello","Eme","Emu","Ene","Ene","Eon","Epa","Epo","Era","Ere","Erg","Ero","Erra","Erre","Erro","Esa","Ese","Eso","Eta","Evo","Fai","Fan","Far","Fas","Fax","Faz","Fea","Feo","Fer","Fes","Fez","Fia","Fie","Fil","Fin","Fio","Fis","Fon","Fua","Fue","Fui","Ful","Full","Gag","Gal","Gap","Gas","Gay","Gea","Gel","Gen","Geo","Ges","Gil","Gin","Gis","Gol","Gro","Gua","Hall","Han","Hao","Has","Hay","Haz","Her","Hez","Hin","Hoy","Hoz","Hui","Hum","Huy","Iba","Icho","Ichu","Ice","Ida","Ido","ies","Ion","Ira","Ire","Isa","Iza","Izo","Jai","Jan","Jau","Jea","Jet","Jis","Jur","Lar","Las","Lay","Lea","Led","Lee","Lei","Len","Leo","Les","Lev","Ley","Lia","Lid","Lie","Lio","Lis","Loa","Loe","Loo","Los","Lua","Lue","Lui","Lux","Luz","Llar","Lles","Mach","Mal","Mam","Man","Mar","Mas","Mea","Mee","Meo","Mes","Mia","Mie","Mil","Mio","Mir","Mis","Miz","Moa","Mod","Mol","Mor","Mua","Mue","Mui","Mur","Mus","Muy","Nao","Nas","Nea","Nen","Neo","Nia","Nin","Nis","Non","Nos","nas","nor","nos","nus","Oas","Obo","Oca","Ocho","Oda","Oes","Off","Ohm","Oia","Oid","Oil","Oir","Ois","Ojo","Ola","Ole","Oli","Olla","Ona","Opa","Ope","Opo","Ora","Ore","Ori","Oro","Osa","Ose","Oso","Oto","Ova","Ove","Ovo","Oxe","Oye","Oyo","Paf","Pal","Pan","Pao","Par","Paz","Pche","Pchs","Pea","Pech","Pee","Pei","Peo","Pes","Pez","Pia","Pie","Pin","Pio","Pis","Ple","Poa","Poch","Pom","Pon","Pop","Por","Pos","Pre","Pro","Psi","Pua","Pub","Pue","Puf","Pum","Pun","Puo","Pus","Put","Que","Qui	Rad","Rae","Rai","Rap","Ras","Rea","Red","Rei","Reo","Res","Rey","Ria","Rie","Rin","Rio","Roa","Rob","Roe","Roi","Rol","Ron","Roo","Ros","Rua","Ruc","Rue","Run","Ruo","Rus","Sah","Sal","San","Sao","Saz","Sea","Sed","Sel","Sen","Seo","Ser","Ses","Set","Sic","Sij","Sil","Sin","Sis","Siu","Sol","Son","Sor","Sos","Soy","Spa","Sud","Sur","Sus","Tac","Tal","Tan","Tao","Tas","Tau","Taz","Tea","Tell","Ten","Ter","Tes","Tex","Tez","Tia","Tic","Tio","Toa","Toe","Tol","Ton","Too","Top","Tos","Tul","Tun","Tup","Tus","Ube","Ubi","Uce","Uchu","Uci","Ues","Ufa","Ufo","Uju","Una","Une","Uni","Uno","Una","Une","Uni","Uno","Upa","Upe","Upo","Ura","Uro","Usa","Use","Uso","Uta","Uva","Uve","Uvi","Uzo","Val","Van","Vas","Vea","Ved","Ven","Veo","Ver","Ves","Vez","Via","Vid","Vil","Vio","Vip","Vis","Vos","Voy","Voz","Xis","Yal","Yaz","Yen","Yes","Yin","Yip","Yod","Yos","Zar","Zas","Zen","Zis","Zoo","Zua","Zum"};
		Scanner input = new Scanner(System.in);
		boolean haha = false;
		System.out.println("Ingresa la palabra que quieres buscar:");
		String in = input.next();
		in = in.toLowerCase();
		

		for(int i = 0; i<Scrabble.length-1; i++) {
			Scrabble[i] = Scrabble[i].toLowerCase();
		}

		System.out.println(busquedaLineal(Scrabble,in) + " --- BUSQUEDA LINEAL");
		System.out.println(binarySearch(Scrabble, Scrabble.length-1, 0, in) + " --- BINARY SEARCH");

		int recursive = recursiveBinary(Scrabble, Scrabble.length-1, 0, in);
		if(recursive>=0) {
			System.out.println(in + " se encuentra en la posicion: " + recursive + " ----- RECURSIVO");
		}else{
			System.out.println(in + " no se encuentra en la lista" + " ----- RECURSIVO");
		}


	}

	//BUSQUEDA LINEAL
	public static boolean busquedaLineal(String[] a, String in){

		boolean res = false;

		for(String s: a){
			if(s.equalsIgnoreCase(in)) {
				res = true;
				break;
			}
		}
		return res;
	}//BUSQUEDA LINEAL

		//BINARY SEARCH ITERATIVO
	public static boolean binarySearch(String[] a, int high, int low, String b){

		while(low <= high){

			int mid = (low+high)/2;

			if(a[mid].compareTo(b) == 0){
				return true;
			}
			else if(a[mid].compareTo(b) < 0){
				low = mid+1;
			}
			else if(a[mid].compareTo(b) > 0){
				high = mid-1;
			}

		}//while

		return false;

	}//BINARY SEARCH ITERATIVO

	//BINARY SEARCH RECURSIVO
	public static int recursiveBinary(String[] a, int high, int low, String b){

		int mid = (high+low)/2;

		if(a[mid].compareTo(b) == 0) {
			return mid;
		}
		else if(high < low){
			return -1;
		}else{
			if(a[mid].compareTo(b) < 0) {
				return recursiveBinary(a, high, mid+1, b);
			}
			else if (a[mid].compareTo(b) > 0){
				return recursiveBinary(a, mid-1, low, b);
			}
		}

		return -1;

	}//RECURSIVE BINARY



}