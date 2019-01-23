package matriz;

import java.util.Scanner;

public class Matriz {
	
	public static Entrada recibirParametros() {
		
		Entrada entradas;
		int filas,columnas;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el numero de filas que quiere para su matriz");
		filas= (entrada.nextInt());
		System.out.println("ingrese el numero de filas que quiere para su matriz");
		columnas= (entrada.nextInt());
		
		Entrada miEntradas= new Entrada(filas, columnas);
		
		
		return miEntradas;
		
	}
	

	public static void main(String[] args) {
		 
		//https://github.com/juliotobon/matriz.git
		

	
		
	}

}
