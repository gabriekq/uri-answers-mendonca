package com.mendonca;

// resultado certo mas uri dis que esta errado


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner console = new Scanner(System.in);
		
	    int nCases  = Integer.parseInt(console.nextLine());
	    
	    for(int index =0;index < nCases;index++) {
	    	
	    	String input  = console.nextLine();
	    	System.out.println(findScore(input.split("([ ])+")));
	    } 
		

	}
	
 public static String findScore(String[] inputs) {
	 String[] letters = {"A","B","C","D","E"};
		int pretos=0,indexLetra=0;
	    
	        for(int index=0;index < inputs.length ; index++) {
	        	
	        	if(Integer.parseInt(inputs[index]) <= 127 ) {
	        		pretos++;
	        		indexLetra = index;
	        	}
	        }
	    	
	        if(pretos == 1  ) {
	        	return letters[indexLetra];
	        }else {
	        return 	"*";
	        }

	}
	
	
	

}
