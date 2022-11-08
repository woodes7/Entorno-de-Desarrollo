package Actividades;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/*Siguiendo con el proyecto Java anterior, crea una clase llamada Ejercicio9.java
		 * con un método o función principal que nos solicite un número del mes (1 al 12) 
		 * y nos diga con palabras el mes y el número de días que tiene el mes.
		 * En el caso de introducir el mes 2, solicitar un año y comprobar si ese año es 
		 * bisiesto o no para devolver el número de días. */
		
		int mes, anio;
		System.out.println("Dime el número de un mes del 1 al 12: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el año: ");
		Scanner sc2 =  new Scanner(System.in);
		mes =sc.nextInt();
		anio =sc2.nextInt();
		
	
	           
		switch (mes) {
		case 1: 	System.out.print("EL mes es Enero y tiene 31 dias");
			break;
		case 2: 	
		 if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
	            System.out.println("El año " + anio + " es bisiesto");
	            System.out.print("EL mes es febrero y tiene 29 dias");
	        } else {
	        	System.out.print("EL mes es febrero y tiene 28 dias");}
	           			break;
		case 3: 	System.out.print("EL mes es Marzo y tiene 31 dias");
			break;
		case 4: 	System.out.print("EL mes es Abril y tiene 30 dias");
			break;
		case 5: 	System.out.print("EL mes es Enero y tiene 31 dias");
			break;
		case 6: 	System.out.print("EL mes es Enero y tiene 30 dias");
			break;
		case 7: 	System.out.print("EL mes es Enero y tiene 31 dias");
			break;
		case 8: 	System.out.print("EL mes es Enero y tiene 31 dias");
			break;
		case 9: 	System.out.print("EL mes es Enero y tiene 30 dias");
			break;
		case 10: 	System.out.print("EL mes es Enero y tiene 31 dias");
			break;
		case 11: 	System.out.print("EL mes es Enero y tiene 30 dias");
			break;
		case 12: 	System.out.print("EL mes es Enero y tiene 31 dias");
			break;
			default:System.out.println("El número introducido no es correcto");
			break;
				
		
	  }
	}

}
