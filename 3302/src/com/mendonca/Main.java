package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt(console.nextLine());
		
         for(int index=0;index<nCases;index++) {
        	 
        	 int valor = Integer.parseInt(console.nextLine());
        	 System.out.println("resposta "+(index+1)+": "+valor);
         }
		
	}

}
