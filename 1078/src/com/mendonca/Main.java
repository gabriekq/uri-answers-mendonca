package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
	     int tabuada =	Integer.valueOf(console.next());
	     
	     for(int index=1; index<= 10;index++) {
	    	 
	    	 System.out.println(index+" x "+tabuada+" = "+index*tabuada);
	     }
		
		

	}

}
