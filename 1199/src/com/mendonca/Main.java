package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		while(true) {
			
			String valor = console.nextLine();
			
			if( !valor.contains("x")  &&  (Integer.parseInt(valor) < 0)  ) {
				break;
			}
			
			if(valor.contains("x")) {
				long numero = Long.decode(valor);
				System.out.println(numero);
			}else {
				
				String hexadecimal = "0x"+Integer.toHexString( Integer.parseInt(valor)).toUpperCase();
				System.out.println(hexadecimal);	
			}
		}
		
	}

	
	
	
	
	
}
