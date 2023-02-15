package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException  {
		
		
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		
		Scanner console = new Scanner(System.in);
		
		int index=1;
		
		while(console.hasNext()) {
			
		String value = console.nextLine();
		
		String rate = evaluateInterestRate(  Double.parseDouble( value.split(" ")[0]) , Double.parseDouble( value.split(" ")[1]) );	
		
		rate = rate.replaceAll(",", ".");
		System.out.println("Projeto "+index+":");
		System.out.println("Percentual dos juros da aplicacao: "+rate+" %");
		
		index++;
		
		   if(console.hasNext()) {
			   System.out.println();
		   }
		
		
		}
		System.out.println();
	
		
	}

	private static String evaluateInterestRate(double value1, double value2) {
		
		double interest =   value2-value1;
		interest = (interest*100)/value1;

		return String.format("%.2f", interest) ;   
	}

}
