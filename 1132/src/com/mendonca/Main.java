package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console  = new Scanner(System.in);
		
		int valor1 =  Integer.parseInt( console.nextLine());
		int valor2 =  Integer.parseInt( console.nextLine());
		
		int maior = valor1 > valor2 ? valor1 : valor2;
		int menor = valor1 < valor2 ? valor1 : valor2;
		
		int soma =0;
		for(int index= menor; index < maior+1; index++ ) {
			
			if(index  % 13 != 0 ) {
				soma = soma + index;
			}
		}
		System.out.println(soma);
		
		

	}

}
