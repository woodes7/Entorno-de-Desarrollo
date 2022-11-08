package Actividades;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*Siguiendo con el proyecto Java anterior, crea una clase llamada Ejercicio17.java 
		con un método o función principal que solicite introducir un número N, 
		y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N.
		El proceso termina cuando el usuario acierta.*/
		
		int num;
		System.out.println("Dime un número del uno al 100");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for (int i= num; i < 100  ; i++) { 

		    // Primero se evalúa si se ha acertado.
			Scanner sc1 = new Scanner(System.in);
			int n2 = sc1.nextInt();
		    if (n2 == num) {  
		      System.out.println("¡Has acertado!"); 
		      break; } 	    	   		   
		    
		    // Si no es ninguno de los casos anteriores, comparamos números.
		    
		    else if (num > n2) 
		      System.out.println("El número secreto es MAYOR que " + n2);
		    else if (num < n2 )
		      System.out.println("El número secreto es MENOR que " + n2);
		}
	}
}
