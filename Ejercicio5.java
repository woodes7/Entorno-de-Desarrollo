package Actividades;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota;
		Scanner num = new Scanner(System.in);
		
		System.out.println("Dime una nota del 1 al 10: ");
		nota= num.nextInt();
				
		switch (nota) {
        
        case 0:
            System.out.print("Cero");
            break;
        case 1:
            System.out.print("Uno");
            break;
        case 2:
            System.out.print("Dos");
            break;
        case 3:
            System.out.print("Tres");
            break;
        case 4:
            System.out.print("Cuatro");
            break;
        case 5:
            System.out.print("Cinco");
            break;
        case 6:
            System.out.print("Seis");
            break;
        case 7:
            System.out.print("Siete");
            break;
        case 8:
            System.out.print("Ocho");
            break;
        case 9:
            System.out.print("Nueve");
            break;
        case 10:
            System.out.print("Diez");
            break;
        default:
            System.out.print("Ese numero no esta entre el 0 y el 10");
		
        }
		num.close();
	}

}
