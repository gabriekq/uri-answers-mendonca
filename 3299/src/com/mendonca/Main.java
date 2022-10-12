package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String value = console.nextLine();
		
		if(value.contains("13")) {
			System.out.println(value+" es de Mala Suerte");
		}else {
			System.out.println(value+" NO es de Mala Suerte");
		}
		
		
		
		
		

	}

}
