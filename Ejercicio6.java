package Actividades;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner num1 = new Scanner(System.in);		
		System.out.println("Dime un número para sacar su factorial: ");
			a= num1.nextInt();
			
			int producto =1;
		
		if (a==0) {
		System.out.println("El factorial de ces es " + num1);
		}
		else {
		for (int i= producto ; i <=a; i++)  {
			 
			producto = producto*=i;
		}
		System.out.println("El factorial de "+ a+ " es "+ producto );
		
	}
	}
}
