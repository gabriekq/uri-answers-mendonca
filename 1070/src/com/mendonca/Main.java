package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int valor =  Integer.parseInt(console.nextLine());
		
		if(valor % 2 == 0) {
			valor++;
		}
		
		for(int index=valor;index< valor+12;index++) {
			
			if(index % 2 != 0) {
				System.out.println(index);
			}
				
		}
	}

}
