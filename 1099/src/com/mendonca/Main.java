package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		int nCases =  Integer.parseInt(console.nextLine());
				
		for(int index=0;index<nCases;index++) {
			
			String valor = console.nextLine();		
			String valores[] = valor.split(" ");
			
			int maior =  Integer.parseInt(valores[0]) >  Integer.parseInt(valores[1]) ?  Integer.parseInt(valores[0]) : Integer.parseInt(valores[1]);
			int menor =  Integer.parseInt(valores[0]) <  Integer.parseInt(valores[1]) ?  Integer.parseInt(valores[0]) : Integer.parseInt(valores[1]);
			
			menor = menor %2 ==0 ? menor-1:menor;
			
			int resultado = somaImpares(menor, maior);
			System.out.println(resultado);
		}
	}

	private static int somaImpares(int menor, int maior) {
		int soma = 0;
		for(int index=menor+2;index < maior;index = index +2 ) {
			soma = soma + index;
		}
		
		return soma;
	}

}
