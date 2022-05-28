package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String valor  = console.nextLine();
		
		String valor2  = console.nextLine();
		
		
		int resultado = Integer.parseInt(valor) - Integer.parseInt(valor2);
		
		System.out.println(resultado);
		
		

	}

	
	
	
}
