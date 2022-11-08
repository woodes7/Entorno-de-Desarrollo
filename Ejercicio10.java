package Actividades;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*Siguiendo con el proyecto Java anterior, crea una clase llamada Ejercicio10.java 
		 *con un método o función principal que lea un número entero mayor que 0 y calcule
		 *la suma 1+2+3+4+…+N, donde N es el número introducido.
		 * */
		
		int num;
		System.out.println("Dime un numero entero mayor que 0: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("El numero introducido no es  mayor que 0");
		}
		else {
		int i, suma= 0; 
		for(i =1; i<=num; i++) {
			
			suma+=i;						
		}
		System.out.println("La suma 1+2+3+4+…+N = " +suma);
		
		}
	}
}
