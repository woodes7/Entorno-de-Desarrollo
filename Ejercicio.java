package Actividades;
import java.util.Scanner;
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un número para numero: ");
		int numero = scanner.nextInt();
		if(numero % 2==0) {
		System.out.println("Los numeros elegidos es "+ numero + " es par.");
		
	} else {
		System.out.println("El número es "+numero+" impar.");
	}

}
}
