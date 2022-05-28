package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		
		while(true) {
			
			String valor = console.nextLine();
			String valores[] = valor.split(" ");
					
			if( valores[0].equals(valores[1])  ) {
				break;
			}else {				
				String result = Integer.parseInt( valores[0] ) > Integer.parseInt( valores[1] ) ? "Decrescente": "Crescente" ;
				System.out.println(result);
			}

		}
		
		
		
		

	}

}
