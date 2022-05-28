package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE;
		int indexMaior =0;
		
		for(int index=0;index < 100;index++) {
			
		   int valor  = Integer.parseInt( console.nextLine());
		   
		   if(valor > maior) {
			   maior = valor;
			   indexMaior = index;
		   }	
		 }
		
		System.out.println(maior);
		System.out.println(indexMaior+1);

	}

}
