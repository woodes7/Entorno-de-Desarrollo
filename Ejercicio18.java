package Actividades;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/* Basándonos en el ejercicio anterior, dentro del proyecto Java anterior, 
		 * crea una clase llamada Ejercicio18.java con un método o función principal que en vez de introducir 
		 * un número que N tome un valor aleatorio. 
		 * Para ello podemos usar la librería Math.random(); este método de la librería devuelve un valor double 
 		 * lo que tendremos que hacer un casting a entero.		 * 
		 */
		
		 int alazar = (int) Math.floor(Math.random()*100+1);
		System.out.println("Acierta el numero");
		
		for (int i= alazar;  ; i++) { 

		    // Primero se evalúa si se ha acertado.
			Scanner sc = new Scanner(System.in);
			int n2 = sc.nextInt();
		    if (n2 == alazar) {  
		      System.out.println("¡Has acertado!"); 
		      break; } 	    	   		   
		    
		    // Si no es ninguno de los casos anteriores, comparamos números.
		    
		    else if (alazar > n2) 
		      System.out.println("El número secreto es MAYOR que " + n2);
		    else if (alazar < n2 )
		      System.out.println("El número secreto es MENOR que " + n2);
		}
		
	}

}
