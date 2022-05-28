package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double pi = 3.14159;
		
		Scanner console = new Scanner(System.in);
		
		double raio =  Double.parseDouble(console.nextLine());
		
		
		double area = pi * Math.pow(raio, 2);
		
		System.out.println("A="+ String.format("%.4f", area));
		
		
		

	}

}
