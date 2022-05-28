package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new  Scanner(System.in);
		
		int nCases =  Integer.parseInt(console.nextLine());
		
		
		for(int index=0;index < nCases;index++ ) {
			
			String input = console.nextLine();
			
			int avanco = Integer.parseInt(console.nextLine());
			
		    String saida = nextWord(input,avanco);
		    System.out.println(saida);	
		}	
	}
	
	
	
	public static String nextWord(String input,int avanco) {
		
		StringBuilder result = new StringBuilder();
		
		for(int index=0;index < input.length() ; index++) {
		  
			int letter =	input.codePointAt(index);
		  
			   if( (letter- avanco) < 65  ) {
				   
				   int balence =    65 - (letter- avanco);
				   
				   int finalletter = 91 -  balence ;  
					char caracter = (char) finalletter;		
					result.append(caracter);
			   }else {
				
				int finalletter = 0 ;
				finalletter = finalletter +  (letter - avanco );				
				char caracter = (char) finalletter;
				result.append(caracter);  
			   }

		}
		
		return result.toString();
	}

}
