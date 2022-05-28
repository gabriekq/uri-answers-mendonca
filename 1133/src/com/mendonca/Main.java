package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner console = new Scanner(System.in);
		 
	    int valor1 = console.nextInt();
	    
	    int valor2 = console.nextInt();
	    
	      
	    if(valor2 > valor1) {    
	             valor1 = valor1 +1;  
	             for(int index=valor1; index  < valor2;index++ ) {
	    	
	    	     if(  (index % 5 == 2)  || (index % 5 == 3)  ) {
	    		     System.out.println(index);
	    	       }
	              }
		}else {
		        valor2 = valor2 +1;  
		        for(int index=valor2; index  < valor1;index++ ) {
		    	
		    	    if(  (index % 5 == 2)  || (index % 5 == 3)  ) {
		    		System.out.println(index);
		    	   }
		         }
		     }
		

	}

}
