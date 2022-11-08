package Actividades;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*Crear un programa Java que solicite por pantalla un número entero y muestre su cuadrado. 
		 * Repetir el proceso hasta que el usuario introduzca un número negativo.
		 */
		
		int nota;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("Dime un número entero: ");
			nota= sc.nextInt();
			if(nota>=0)
			System.out.println (nota *= nota);
			else System.out.println("FIN DEL PROGRAMA");
			}
			while( nota>=0 );
				System.out.println("FIN DEL PROGRAMA");
				sc.close();
		
	}

}
