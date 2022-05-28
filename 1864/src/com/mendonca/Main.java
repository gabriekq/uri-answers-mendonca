package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		
		Scanner console = new Scanner(System.in);
		
		int index = Integer.parseInt(console.nextLine());
		
		System.out.println(frase.substring(0, index));
		
		

	}

}
