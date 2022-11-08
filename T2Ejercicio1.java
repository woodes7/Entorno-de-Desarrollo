package Actividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos numeros quires introducir enla lista? ");	
		int cantidad = sc.nextInt();
		List<Integer>l1 = new ArrayList<Integer>();
		
		for(int i=0 ; i<=cantidad;  i++) {
			Scanner sc1 = new Scanner(System.in);
			
			System.out.println("Introduzca el "+i+"º número:");
			l1.add(sc1.nextInt());	
			
			}
		int j=0;
			while (j <l1.size()) {
				System.out.print(l1.get(j)+" ");
				j++;
			}
			sc.close();
			
		}		
	}


