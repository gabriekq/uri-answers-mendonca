package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int valor = Integer.parseInt(console.nextLine());
		
		
		for(int index=1;index<valor+1;index++) {
			
			double quadrado =  Math.pow(index, 2);
			double cubo =  Math.pow(index, 3);
			
			System.out.println(index+" "+(int)quadrado+" "+(int)cubo);	
		}
		

	}

}
