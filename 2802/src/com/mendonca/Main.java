package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner console = new Scanner(System.in);
		
		long input =  Long.parseLong( console.nextLine() );	
		long saida = 1 +  (((input-1)*input)/2)+ ((input* (input-1)*(input-2) *(input-3))/24)  ;

		System.out.println(  saida );
		
		

	}

}
