package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		
		int valor1 = Integer.valueOf(console.next());
		
		int valor2 = Integer.valueOf(console.next());
		
		int valor3 = Integer.valueOf(console.next());
		
		int valor4 = Integer.valueOf(console.next());
		
		int saida=  (valor1 * valor2) - (valor3*valor4);
		
		
		System.out.println("DIFERENCA = "+saida);
		

	}

}
