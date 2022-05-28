package com.mendonca;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner console = new Scanner(System.in);
		
		String input1 = console.nextLine();
		String input2 = console.nextLine();
		
		int qdtProd =  Integer.parseInt(input1.split("([ ])")[1]);
		double price =  Double.parseDouble(input1.split("([ ])")[2]);
		
		
		int qdtProd2 =  Integer.parseInt(input2.split("([ ])")[1]);
		double price2 =  Double.parseDouble(input2.split("([ ])")[2]);
		
		
		double result = (qdtProd2*price2) + (qdtProd*price);
		
		System.out.println("VALOR A PAGAR: R$ "+ df.format(result));
		

	}

}
