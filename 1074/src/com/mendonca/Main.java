package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index<nCases;index++) {
			
			int valor = Integer.parseInt(console.nextLine());
			String negativoPositivo = validadeNegativePositive(valor);
			
			if(negativoPositivo.equalsIgnoreCase("NULL")) {
				System.out.println("NULL");
			}else {
				String tipo = avaliateNumber(valor);
				System.out.println(tipo+" "+negativoPositivo);
			}
		}
		

	}

	private static String validadeNegativePositive(int valor) {
		
		if(valor > 0) {
			return "POSITIVE";
		}
		
		if(valor < 0) {
			return "NEGATIVE";
		}
		return "NULL";
	}

	private static String avaliateNumber(int valor) {
		
		if(valor % 2 == 0) {
			return "EVEN";
		}else {
			return "ODD";
		}
	}

}
