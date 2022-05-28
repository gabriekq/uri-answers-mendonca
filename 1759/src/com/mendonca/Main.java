package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		StringBuilder resultado =  new StringBuilder();
		Scanner console = new Scanner(System.in);
		
		int numero = Integer.parseInt(console.nextLine());
		
		for(int index=0;index<numero;index++) {
			resultado.append("Ho ");
		}
		
		System.out.println(resultado.toString().trim()+"!");
		

	}

}
