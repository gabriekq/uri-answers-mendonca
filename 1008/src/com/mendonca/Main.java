package com.mendonca;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner console = new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		
		int value1 = Integer.valueOf(console.next());
		
		int value2 = Integer.valueOf(console.next());
		
		double value3 = Double.valueOf(console.next());
		
		
		double saida = value2 * value3;
		
				
				
		System.out.println("NUMBER = "+value1);	
		System.out.println("SALARY = U$ "+formatter.format(saida));		
		

	}

}
