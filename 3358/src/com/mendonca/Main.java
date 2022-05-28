package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index< nCases;index++) {
			
		  String name = console.nextLine();
		  boolean easy = checkName(name.toLowerCase());
		  
		  if(easy == true) {
			  System.out.println(name+" eh facil");
		  }else {
			  System.out.println(name+" nao eh facil");
		  }
			
			
		}
		
	}
	
   public static boolean  checkName (String name) {
	   	  
	   int consoantes =0;

	   for(int index=0;index < name.length();index++) {
		 char letter =  name.charAt(index);
		 
		 if(letter !='a' && letter !='e' && letter !='i'  && letter !='o' && letter !='u' ) {
			 consoantes++;
		 }else {
			 consoantes =0 ;
		 }
		 
		 if(consoantes == 3) {
			 return false;
		 }
		 
		   
	   }
	   
	   return true;
   }
	
	
	

}
