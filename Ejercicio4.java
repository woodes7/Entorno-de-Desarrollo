package Actividades;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, contador;
		contador= 0;
		for ( i=10 ; i<=70; i++) {			
			if(i % 3 ==0 )							
				contador++;			
		}
			System.out.println("Total de multiplos de 3 son que hay entre 10 y 70: " + contador);			
	}	
}
