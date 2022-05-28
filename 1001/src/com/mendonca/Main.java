package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int valor1 = Integer.parseInt(console.nextLine());
		
		int valor2 = Integer.parseInt(console.nextLine());
		
		int soma = valor1 + valor2;
		
		System.out.println("X = "+soma);
		

	}

}
