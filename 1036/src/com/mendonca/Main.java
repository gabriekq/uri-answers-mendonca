package com.mendonca;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String values =  console.nextLine();
		
		double valueA =  Double.parseDouble(values.split("([ ])+")[0]);  
		
		double valueB =  Double.parseDouble(values.split("([ ])+")[1]);  
		
		double valueC =  Double.parseDouble(values.split("([ ])+")[2]);  
		
		
	
			
		double resultPositive =	calcularBascakara(valueA,valueB,valueC,1);
		double resultNegative =	calcularBascakara(valueA,valueB,valueC,-1);
		
		if(Double.isNaN(resultPositive) || Double.isNaN(resultNegative)    ) {
			System.out.println("Impossivel calcular");
		}else {
			System.out.println("R1 = "+String.format("%.5f",resultPositive ) );
			System.out.println("R2 = "+String.format("%.5f",resultNegative));
		}
		

	}
	
	
	public static double calcularBascakara(double a,double b,double c,int sinal){
		if(b > 0) {
			b = b * -1;
		}
		
		double result =  ( (b *sinal) +    Math.sqrt( Math.pow(b,2)- (4*(a*c)) )) /  (2*a);
		
		if(result > 0) {
			result = result * (-1);
		}
	
		return result ;
	}
	
	
	

}
