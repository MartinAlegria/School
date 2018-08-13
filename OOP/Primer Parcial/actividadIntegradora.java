
import java.util.*;
import java.lang.*;

public class actividadIntegradora{

	static char[] alphaArray = {
	'a','b','c','d','e','f','g','h','i'
	,'j','k','l','m','n','ñ','o','p','q'
	,'r','s','t','u','v','w','x','y','z','_'

	};

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//System.out.println();
		System.out.println("\n///////////////////////////\n " + 
			"Que deseas hacer ?\n 1.- Encriptar\n 2.-Decifrar\n [Escoge el número de la opción deseada]: ");
		int opt = input.nextInt();

		if(opt==1) {

			System.out.println("\n///////////////////////////\nIngresa el texto que deseas encriptar (usa el guión bajo '_' como): ");
			String text = input.next();	
			String encryptedText = encrypt(text);
			System.out.println(encryptedText);
			
		}else{

			System.out.println("\n//////////////////////\nIngresa el texto a decifrar:");
			String text = input.next();
			String decryptedText = decrypt(text);
			System.out.println("\nTu texto decifrado es: " + decryptedText);

		}		

		
	}

	public static String encrypt(String textToEncrypt){

		String t2e = textToEncrypt;
		String encrypted = "";
		int charNumber = 0;
		String binaryString = "";

		for(int i = 0; i<t2e.length(); i++) {
			
			for(int j= 0; j<alphaArray.length; j++ ) {
					
				if(t2e.charAt(i) == alphaArray[j]) {
				charNumber = (j+1) * 8;
				binaryString = Integer.toBinaryString(charNumber);

				if(i == t2e.length()-1) {
					encrypted += binaryString;
				}else{
					encrypted += binaryString + "-";
				}
			}

			}

		}//for

		return encrypted;

	}//ENCRYPT

	public static String decrypt(String textToDecrypt){

		String text = textToDecrypt;
		String decrypted = "";
		String[] arrayText = text.split("-");
		int decimalBinary = 0;

		for(int i = 0; i<arrayText.length; i++) {

			decimalBinary = (Integer.parseInt(arrayText[i], 2)/8);
			decrypted += alphaArray[decimalBinary-1];
		}

		return decrypted;


	}//DECRYPT




}//class