package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		int vetor[] = new int[10];
		Scanner console = new Scanner(System.in);
		
		int value = Integer.parseInt( console.nextLine());
		
		for(int index=0; index < vetor.length;index++ ) {									
			vetor[index] = value;
			value = value + value;			
		}
				
		for(int index=0; index < vetor.length;index++ ) {
			System.out.println("N["+index+"] = "+vetor[index]);
		}
		
				

	}

}
