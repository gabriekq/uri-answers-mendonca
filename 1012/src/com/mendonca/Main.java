package com.mendonca;

import java.util.Scanner;

// https://www.beecrowd.com.br/judge/pt/problems/view/1012?origem=1

public class Main {

	public static void main(String[] args) {
		
		  final double pi = 3.14159;
		
		Scanner console =  new Scanner(System.in);	
		String input = console.nextLine();
		
		String []inputs = input.split("([ ])+");
		
		double inputA =  Double.parseDouble(inputs[0]);
		double inputB =  Double.parseDouble(inputs[1]);
		double inputC =  Double.parseDouble(inputs[2]);
		
		double triangulo = (inputA * inputC) / 2;
		double circulo =  pi * Math.pow(inputC, 2);
		double trapesio = ((inputA + inputB) * inputC) / 2;
		double quadrado = inputB *inputB;
		double retangulo = inputA * inputB; 
		
		System.out.println("TRIANGULO: "+ String.format("%.3f", triangulo));
		System.out.println("CIRCULO: "+ String.format("%.3f",circulo));
		System.out.println("TRAPEZIO: "+String.format("%.3f",trapesio));
		System.out.println("QUADRADO: "+String.format("%.3f",quadrado));
		System.out.println("RETANGULO: "+String.format("%.3f",retangulo));
		
		
	}

}
