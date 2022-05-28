package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	  Scanner console = new Scanner(System.in);
	  
	  String input = console.nextLine();
	
	  String valores[] = input.split(" ");
	  
	  double valorInicial = Double.parseDouble(valores[0]);	
	  double valorFinal = Double.parseDouble(valores[1]); 
	  double result = (valorFinal/valorInicial-1)*100;
	  
	  System.out.println(String.format("%.2f", result)+"%");
	  
	  
		
	}
	
	
	
	
	
	

}
