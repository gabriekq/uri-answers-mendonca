package com.mendonca;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		String name = console.next();
		
		double salary = Double.parseDouble(console.next());
		
		double comissao = Double.parseDouble(console.next());
		
		double saida = salary + (comissao*0.15);
		
		System.out.println("TOTAL = R$ "+formatter.format(saida));
		
		

	}

}
