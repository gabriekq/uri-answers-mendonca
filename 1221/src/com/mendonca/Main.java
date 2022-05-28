package com.mendonca;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index<nCases;index++  ) {
			
		long value = Long.parseLong(console.nextLine());
			
		    System.out.println(isPrime(103));
			

		}
		
	}
	
	public static String isPrime(long valor) {
		
	    int  raiz =    (int)Math.sqrt(valor) ;
		int total=0;
		

	    for(int index=3; index <= raiz; index +=2 ) {
	    	
	    	if(valor  % index == 0 ) {
	    		total++;
	    	}
	    }
	    
	    if(total >= 1) {
	    	return "Not Prime";
	    }else {
	    	return "Prime";
	    }
	 }
	
	
	
	
	
}
