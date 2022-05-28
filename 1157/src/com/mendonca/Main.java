package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int valor = Integer.parseInt(console.nextLine());
		
		for(int index=1;index<=valor;index++) {
			
			if(valor % index == 0 ) {
				System.out.println(index);
			}
		}
	}

}
