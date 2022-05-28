package com.mendonca;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String silab, silab2;
		
		String input = console.nextLine();
		
		String[] words= input.split("([ ])+");
		
		for (  String word : words ) {
			
			if(word.length() >= 4) {
				silab = word.substring(0, 2);
				silab2 = word.substring(2,4 );
				
				if(silab.equals(silab2)) {
					word =  word.substring(2,word.length() );
				 }
			  }
			sb.append(word+" ");	
		}
		
		System.out.println(sb.toString().trim());
	}
}
