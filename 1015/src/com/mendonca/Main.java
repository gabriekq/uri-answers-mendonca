package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String input1 = console.nextLine();	
		String input2 = console.nextLine();
		
	    String []inputs1 = input1.split("([ ])+");
	    String []inputs2 = input2.split("([ ])+");
		
	    double x1 = Double.parseDouble(inputs1[0]);    
	    double y1 = Double.parseDouble(inputs1[1]);
	    
	    double x2 = Double.parseDouble(inputs2[0]);    
	    double y2 = Double.parseDouble(inputs2[1]);
	    
	    double saida =  Math.sqrt( Math.pow( x2 - x1  , 2) + Math.pow( y2 - y1  , 2));
	    
	    System.out.println(String.format("%.4f",saida));
		

	}

}
