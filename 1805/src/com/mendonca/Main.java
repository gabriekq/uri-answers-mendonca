package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String valores =  console.nextLine();
		
		long valor1 = Long.parseLong(valores.split("([ ])+")[0]);
		long valor2 = Long.parseLong(valores.split("([ ])+")[1]);
		
		long maior = valor1 > valor2 ? valor1 : valor2;
		long menor = valor1 < valor2 ? valor1 : valor2;
		
		long soma = SomaIntervalo(menor,maior);
		System.out.println(soma);

	}

	
	public static long SomaIntervalo(long menor, long maior) {
		
		long resultado=0;
	     for(long index=menor;index<=maior;index++   ) {
	    	 resultado = resultado + index;
	     }
		return resultado;
	}
	
	
	
}
