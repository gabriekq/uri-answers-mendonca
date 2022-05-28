package com.mendonca;


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		
		// https://www.urionlinejudge.com.br/judge/pt/problems/view/1005
		Locale.setDefault(Locale.US);
		
		
		
		 Scanner console = new Scanner(System.in);
		
		

		  double nota =  console.nextDouble();
		  double nota2 = console.nextDouble();
		 
		  double averge = ((nota * 3.5) + (nota2*7.5))/11.0;
		
		System.out.printf("MEDIA = %.5f%n",averge);
		
		
		

	}

}
