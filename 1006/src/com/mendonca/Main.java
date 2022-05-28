package com.mendonca;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("#0.0");
		
		double note1 = Double.valueOf(console.next());
		
		double note2 = Double.valueOf(console.next());
		
		double note3 = Double.valueOf(console.next());
		
		double saida = ((note1*2)+(note2*3)+(note3*5))/10;
		
		System.out.println("MEDIA = "+formatter.format(saida)   );

	}

}
