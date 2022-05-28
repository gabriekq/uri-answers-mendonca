package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		String input  = console.nextLine();
		
	    String valores[] = input.split("([ ])+");
		
	    double A = Double.parseDouble(valores[0]);
	    double B = Double.parseDouble(valores[1]);
	    double C =  Double.parseDouble(valores[2]);
	    
	    if(isTriangule(A ,B   , C )  ) {
	    	
	    	double perimetro =  A +B+C;
	    	
	    	System.out.println("Perimetro = "+String.format("%.1f", perimetro));
	    
	    }else {
	    	
	    	double area = ((A+B)*C)/2;
	    	
	    	System.out.println("Area = "+String.format("%.1f", area));
	    }
	}

	
	public static boolean isTriangule(double A,double B , double C) {
		
		if(  (A <  (B +C))  &&  (B <  (A +C)) && (C <  (B +A))     ) {
			return true;
		}
		return false;
	}
	
	
	
}
