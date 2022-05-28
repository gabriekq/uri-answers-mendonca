package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		//https://www.beecrowd.com.br/judge/pt/problems/view/1018   terminar
		
		int valor =  Integer.parseInt(console.nextLine());
		final int  input = valor;
		
		int notas100 =  (int) valor / 100;	
		valor = valor  - (notas100 * 100) ; // sobra isso
		
		int notas50 =  (int) valor / 50;	
		valor = valor  - (notas50 * 50) ;
		
		int notas20 =  (int) valor / 20;	
		valor = valor  - (notas20 * 20) ;
		
		int notas10 =  (int) valor / 10;	
		valor = valor  - (notas10 * 10) ;
		
		int notas05 =  (int) valor / 5;	
		valor = valor  - (notas05 * 5);
		
		int notas02 =  (int) valor / 2;	
		valor = valor  - (notas02 * 2);
		
		int notas01 =  (int) valor / 1;	
		valor = valor  - (notas01 * 1);
		
		System.out.println(input);
		System.out.println(notas100+" nota(s) de R$ 100,00");
		System.out.println(notas50+" nota(s) de R$ 50,00");
		System.out.println(notas20+" nota(s) de R$ 20,00");
		System.out.println(notas10+" nota(s) de R$ 10,00");
		System.out.println(notas05+" nota(s) de R$ 5,00");
		System.out.println(notas02+" nota(s) de R$ 2,00");
		System.out.println(notas01+" nota(s) de R$ 1,00");
		

	}

}
