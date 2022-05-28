package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		double vetor[] = new double[100];
		
		for(int index=0;index<vetor.length;index++) {
			
			double valor = Double.valueOf(console.nextLine());
			
			vetor[index] = valor;
		}
		
	
		
		for(int index=0;index<vetor.length;index++) {
			
			if(vetor[index] <= 10) {
				System.out.println("A["+index+"] = "+vetor[index]);
			}
			
			
		}
		
		

	}

}
