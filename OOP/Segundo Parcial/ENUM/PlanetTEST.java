 import java.util.*;

 public class PlanetTEST{

 	public static void main(String[] args) {
 		 
 		double earthWeight = Double.parseDouble(args[0]);
 		double mass = earthWeight/Planet.EARTH.surfaceGravity();

 		for (Planet p: Planet.values() ) {
 			System.out.printf("Your weight %s is %f%n",p,p.surfaceWeight(mass));
 		}
 	}

 }