import java.util.*;
import java.lang.*;

public class Fraccion {

	private int numerador;
	private int denominador;

	Fraccion(int numerador, int denominador) throws ArithmeticException{

		if(denominador == 0) {
			throw new ArithmeticException("0 no puede ser un denominador");
		}
		else if(denominador < 0){
		this.numerador = numerador* -1;
		this.denominador = denominador* -1;
		}
		else{
		this.numerador = numerador;
		this.denominador = denominador;
		}
	}

	Fraccion(int numerador){
		this.numerador = numerador;
		this.denominador = 1;
	}

	Fraccion(){
		this.numerador = 0;
		this.denominador = 1;
	}

	public int getNumerador(){ return numerador;}

	public int getDenominador(){ return denominador;}

	public String toString(){
		String num = Integer.toString(numerador);
		String den = Integer.toString(denominador);
		return "" + num + "/" + den + "";
	}

	public double toDouble(){
		double res = (double)numerador/  (double)denominador;
		return res;
	}

	public Fraccion add(Fraccion f){

		int num1 = numerador;
		int den1 = denominador;
		int num2 = f.getNumerador();
		int den2 = f.getDenominador();

		if(den1 == den2) { //EN CASO DE QUE EL DENOMINADOR SEA EL MISMO
			int resNum = num1 + num2; //SUMA LOS DOS NUMERADORES
			return new Fraccion(resNum, den1); //REGRESA LA FRACCION
		}else{
			int mcm = mcm(den1, den2); //SACA EL MCM DE LOS DOS DENOMINADORES DADOS
			int n1 = (mcm/den1) * num1; //SACA EL PRIMER NUMERADOR A SUMAR
			int n2 = (mcm/den2) * num2; //SACA EL SEGUNDO NUMERADOR A SUMAR
			int resNum = n1 + n2; //SUMA LOS NUMERADORES
			return new Fraccion(resNum, mcm); //REGRESA LA FRACCION

		}
	}

	public Fraccion substract(Fraccion f){

		int num1 = numerador;
		int den1 = denominador;
		int num2 = f.getNumerador();
		int den2 = f.getDenominador();

		if(den1 == den2) { //EN CASO DE QUE EL DENOMINADOR SEA EL MISMO
			int resNum = num1 - num2; //RESTA LOS DOS NUMERADORES
			return new Fraccion(resNum, den1); //REGRESA LA FRACCION
		}else{
			int mcm = mcm(den1, den2); //SACA EL MCM DE LOS DOS DENOMINADORES DADOS
			int n1 = (mcm/den1) * num1; //SACA EL PRIMER NUMERADOR A SUMAR
			int n2 = (mcm/den2) * num2; //SACA EL SEGUNDO NUMERADOR A SUMAR
			int resNum = n1 - n2; //RESTA LOS NUMERADORES
			return new Fraccion(resNum, mcm); //REGRESA LA FRACCION

		}
	}

	public Fraccion multiply(Fraccion f){

		int num1 = numerador;
		int den1 = denominador;
		int num2 = f.getNumerador();
		int den2 = f.getDenominador();

		int resNum = num1 * num2;
		int resDen = den1 * den2;

		return new Fraccion(resNum, resDen);
	}

	public Fraccion divide(Fraccion f){

		int num1 = numerador;
		int den1 = denominador;
		int num2 = f.getNumerador();
		int den2 = f.getDenominador();

		int resNum = num1 * den2;
		int resDen = num2 * den1;

		return new Fraccion(resNum, resDen);

	}

	public Fraccion toLowestTerms(){
		int gcd = gcd(numerador, denominador);
		int num = (numerador / gcd);
		int den = (denominador / gcd);
		System.out.println(numerador + "/" + denominador); //AHORA LA FRACCION ESTA ACTUALIZADA SU MENOR EXPRESION

		return new Fraccion(num,den);
	}

	public void isEquals(Object o){
		if(o instanceof Fraccion) {

			Fraccion f = (Fraccion) o;
			double res1 = toDouble();
			double res2 = f.toDouble();

			if(res1 == res2) {
				System.out.println("Las fracciones son las mismas");
			}else{
				System.out.println("Las fracciones no son las mismas");
			}

		}else{
			System.out.println("El Objecto no es una fraccion");
		}
	}

	public static int gcd(int a, int b){ //METODO QUE SACA EL MAYOR COMUN MULTIPLO DE 2 DENOMINADORES
		while (b > 0){
        int temp = b;
        b = a % b;
        a = temp;
    	} 
    	return a;
	}

	public int mcm(int a, int b){ //METODO QUE SACA EL MINIMO COMUN MULTIPLO
		return a * (b / gcd(a, b));
	}

}//class