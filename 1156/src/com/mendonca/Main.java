package com.mendonca;

public class Main {

	public static void main(String[] args) {
		
		
		double sequencia = 1;
		double divisor=2;
		for(int index=3; index <= 39; index = index +2  ) {		
			sequencia = sequencia + (index /divisor) ;
			divisor = divisor * 2;
		}
		
		System.out.println( String.format("%.2f", sequencia) );
		

	}
	

	
	
	
	
	
	
	
	

}
