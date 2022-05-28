package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// testar mais e avaliar isso aqui
		
		Scanner console = new Scanner(System.in);
		
		
		int valor = Integer.parseInt(console.nextLine());
		
		int segundos = valor % 60;
		int minutos = valor / 60;
		int horas =0;
		
		if(minutos > 60) {
			horas = minutos / 60;
			minutos = minutos % 60;
			
		}
		
		System.out.println(horas+":"+minutos + ":"+segundos);
		
		
		
		 
		

	}

}
