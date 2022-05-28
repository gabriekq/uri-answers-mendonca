package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		do {
			
		int valor = Integer.valueOf(console.next());
		
		if(valor == 0) {
		   break;
		}
			
		for(int index=1;index <= valor;index++  ) {
			sb.append(index+" ");
		}
			
		System.out.println(sb.toString().trim());	
		sb.setLength(0);
		}while(true);
		
		
		
		
		
		

	}

}
