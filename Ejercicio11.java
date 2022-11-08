package Actividades;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/* Siguiendo con el proyecto Java anterior, crea una clase llamada Ejercicio11.java con un método o 
		 * función principal que nos pida una nota de 0 a 10 (usa valores enteros) y muestre un mensaje con el 
		 * siguiente texto: Insuficiente, Suficiente, Bien, Notable, Sobresaliente, Matrícula.
		 * Si la nota introducida no está entre 0 y 10, finaliza el programa mostrando el mensaje ("FIN DEL PROGRAMA") */
		
		int nota;
			Scanner sc = new Scanner(System.in);	
				
		do {
			
			System.out.println("Dime una nota del 1 al 10: ");
			nota= sc.nextInt();
			switch(nota) {
			case 0,1,2,3,4: 
				System.out.println("Insuficiente");
				break;
			case 5: 
				System.out.println("Suficiente");
				break;
			case 6: 
				System.out.println("Bien");
				break;
			case 7,8: 
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Matricula");
				break;
			default: 
				System.out.println("FIN DEL PROGRAMA");
				break;
			}
		}
		while (nota >=0 && nota<=10);
		
	
	}
}
