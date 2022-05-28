package com.mendonca;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("#0.000");
	
		
		int valor = Integer.valueOf(console.next());
		
		double saida = (4.0 / 3)* 3.14159 * Math.pow(valor, 3);
		
		System.out.println("VOLUME = "+formatter.format(saida));
		

	}

}
