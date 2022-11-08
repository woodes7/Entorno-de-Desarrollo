package Actividades;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*Siguiendo con el proyecto Java anterior, crea una clase llamada Ejercicio8.java
	 	 con un método o función principal que nos solicite un número del día de la semana 
 		(1 al 7) y nos diga el día con palabras. En caso de introducir un valor erróneo, 
		 "mostrar un mensaje de error.*/
		
		int num;
		System.out.print("Dime un número del 1 al 7: ");
		Scanner sc = new Scanner(System.in);
		num =sc.nextInt();
		
		
		switch (num) {
		case 1: System.out.println("uno");
			break;
		case 2:	System.out.println("dos");
			break;
		case 3:	System.out.println("tres");
			break;
		case 4:	System.out.println("cuatro");
			break;
		case 5:	System.out.println("cinco");
			break;
		case 6:	System.out.println("seis");
			break;
		case 7:	System.out.println("siete");
			break;
		default : System.out.println("El número introducido no es correcto");
			break;
		}
	}

}
