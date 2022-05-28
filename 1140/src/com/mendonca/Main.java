package com.mendonca;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner console = new Scanner(System.in);
		
		while(true) {
			
			String prase = console.nextLine();
			
			if(prase.equalsIgnoreCase("*")) {
				break;
			}else {
				
			String words[] = prase.split("([ ])+");		
			System.out.println(isTautograma(words));
					
			}
			
	
		}
	}
	
	public static String isTautograma(String words[] ) {
		
		   HashSet<Character> letras = new HashSet<Character>();  
		
		   for(String word : words) {   
			  letras.add(word.toUpperCase().charAt(0));  
		   }
		
		   return letras.size()==1 ? "Y" : "N";
	}
	
	

}
