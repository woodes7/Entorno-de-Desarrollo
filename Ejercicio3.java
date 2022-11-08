package Actividades;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dime un caracter : ");
		char letra = scanner.next().charAt(0);
		if(letra > 'a' && letra < 'z') {
		System.out.println("El caracte " + letra + " es una letra minuscula.");
		
	} else {
		System.out.println("El caracter "+ letra +" es una letra Mayuscula.");
	}

	}

}
