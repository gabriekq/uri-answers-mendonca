package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		while(true) {
			
			if(!console.hasNext()) {
				break;
			}else {
				
	        String input = console.nextLine();
			long valor1 = Long.parseLong(input.split("([ ])+")[0]);
			long valor2 = Long.parseLong(input.split("([ ])+")[1]);
		    long resultado =  valor1 > valor2 ? valor1 - valor2 : valor2 - valor1;	
	        System.out.println(resultado);
			}
		}
		
		

	}

}
