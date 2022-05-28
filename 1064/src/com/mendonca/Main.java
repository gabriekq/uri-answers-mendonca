package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner console = new Scanner(System.in);
		int valoresPositivos = 0;
		double soma =0, media=0;
		
		for(int index=0;index<6;index++) {
			
			double valor = Double.parseDouble(console.nextLine());
			
			if(valor > 0) {
				valoresPositivos++;
				soma = soma + valor;
			}
			
		}
		
		media = soma / valoresPositivos;
		System.out.println(valoresPositivos+" valores positivos");
		System.out.println(String.format("%.1f", media));
		

	}

}
