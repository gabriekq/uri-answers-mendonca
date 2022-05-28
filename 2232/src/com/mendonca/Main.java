package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		
		int nCases = Integer.parseInt( console.nextLine());
		
		for(int index=0;index<nCases;index++) {
			
		int valor = Integer.parseInt( console.nextLine());
		
		long resultado =  (long) Math.pow(2, valor) -1;
		
		System.out.println(resultado);
			
			
		}
		
		

		
		
	}

}
