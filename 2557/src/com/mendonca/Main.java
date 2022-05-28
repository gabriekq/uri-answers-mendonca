package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		do {
			
			
		if(console.hasNext()){	
			
		String input  = console.next();
		
		if(input.contains("J")) {
			int value1 = Integer.valueOf(input.split("([+])")[0]);
			int value2 = Integer.valueOf(input.split("([+])")[1].replace("=J", ""));
			int soma = value1 + value2;
			System.out.println(soma);
		}else {
			
			if(input.contains("L")) {
				int value1 = Integer.valueOf(input.split("([+])")[0]);
				int value2 = Integer.valueOf(input.split("([+])")[1].replace("L=", ""));
				int resultado = value2 - value1;
				System.out.println(resultado);	
			}else {
				
				int value1 = Integer.valueOf(input.split("([=])")[0].replace("R+", ""));
				int value2 = Integer.valueOf(input.split("([=])")[1]);
				int resultado = value2 - value1;
				System.out.println(resultado);		
			}	
		}

		}else {
			break;
		}
				
		}while(true);
		

	}

}
