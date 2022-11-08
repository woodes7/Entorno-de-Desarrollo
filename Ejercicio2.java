package Actividades;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime un número para numero: ");
		int numero = scanner.nextInt();
		if(numero % 10==0) {
		System.out.println("Los numeros elegidos es "+ numero + " es multiplo de 1.");
		
	} else {
		System.out.println("El número es "+numero+" no es multiplo de 10.");
	}

	}

}
