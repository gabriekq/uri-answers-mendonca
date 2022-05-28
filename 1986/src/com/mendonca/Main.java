package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		String entrada;
		StringBuilder saida = new StringBuilder();
		
		Scanner console = new Scanner(System.in);
		
		int nCasos = console.nextInt();
		
		for(int index=0;index < nCasos;index++) {
			
		entrada = console.next();	
	    char convertedValue = (char) Integer.parseInt(entrada, 16);
		saida.append(convertedValue);
			
		}
		
		System.out.println(saida.toString());

	}

}
