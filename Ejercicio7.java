package Actividades;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		int b;
		System.out.println("Dime dos número para sacar su factorial: ");
		Scanner num1 = new Scanner(System.in);		
			a= num1.nextDouble();
			
		Scanner num2 = new Scanner(System.in);		
			b= num1.nextInt();
	
		 int resultado = 1;
	        for (int i = 1; i <= b; i++) {

	        	 resultado =  (int) (resultado * a);

	        }

	       System.out.println( resultado);

	}

}
