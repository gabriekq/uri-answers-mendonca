package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		ArrayList<Double> valores = new ArrayList<Double>();
		Scanner console = new Scanner(System.in);
		double media = 0 ;
		
		
	     while(true) {
		
	    	 String valor = console.nextLine();
	    	 double numero = Double.parseDouble(valor);
	    	 
	    	 if(numero < 0 ) {
	    		 media = valores.parallelStream().reduce( (a,b) -> a+b  ).orElse((double) 0) / valores.size();
	    		 System.out.println( String.format("%.2f",media) );
	    		 break;
	    	 }else {
	    		 valores.add(numero);
	    	 }

	      }
		
	}
	

}
