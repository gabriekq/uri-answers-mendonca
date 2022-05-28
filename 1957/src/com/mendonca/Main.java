package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		int valor = Integer.parseInt( console.nextLine());
		System.out.println( Integer.toHexString(valor).toUpperCase()  );
		
		
		
	}

}
