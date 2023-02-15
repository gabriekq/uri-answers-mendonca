package com.mendonca;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		double values[] = new double[100]; 
		
		double inputValue = Double.parseDouble(console.nextLine());
		
		values[0] = inputValue;
				
		for(int index=1, div=1 ;index < values.length;index++,div++ ) {
			
			
			
			values[index] = (values[index-1]/2) ;
			
		}
		
		for(int index=0;index<values.length; index++ ) {
			System.out.println("N["+index+"] = "+String.format("%.4f", values[index]));
		}

	}


}
