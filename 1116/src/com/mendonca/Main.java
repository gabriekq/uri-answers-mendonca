package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		double nCases = Double.parseDouble(console.nextLine());
		
		for(int index=0;index<nCases;index++) {
			
			String input = console.nextLine();
			
			String inputs[] =  input.split("([ ])+");	
		   String result = divide(Double.parseDouble(inputs[0]),Double.parseDouble(inputs[1]));
			System.out.println(result);
		}

	}

	
	public static String divide(double divisor , double dividendo  ) {
		
		double resultado= 0;
				
		resultado = divisor / dividendo;			
	   if(Double.isInfinite(resultado)) {
		  return "divisao impossivel"; 
	   }else {
		   return 	String.format("%.1f", resultado);
	   }		
	} 
	
	
	
	
	
	
}
