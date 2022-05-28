package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int countPositivos =0;
		Scanner console = new Scanner(System.in);
		
		
		
		for(int index=0;index<6;index++) {
			
			double valor = Double.parseDouble(console.nextLine() );
			
			if(valor > 0) {
				countPositivos++;
			}
		}
		
		System.out.println(countPositivos+" valores positivos");
		
		

	}

}
