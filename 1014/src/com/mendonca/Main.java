package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		
		int valor1 = Integer.parseInt(console.nextLine());
		
		double valor2  =   Double.parseDouble(console.nextLine());
		
		double saida = valor1 / valor2;
		
		System.out.println(String.format("%.3f", saida)+" km/l");
		

	}

}
