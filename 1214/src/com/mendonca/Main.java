package com.mendonca;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	// resolvido mas uri com defeito
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int nCases =  Integer.parseInt(console.nextLine());
		
		for(int index=0;index<nCases;index++) {
			
			String valor = console.nextLine();
			String valores[] = valor.split("([ ])+");
			
		    double media = 	Arrays.stream(valores).mapToInt(v ->  Integer.parseInt(v) ).skip(1).reduce(0, Integer::sum)/ Integer.parseInt(valores[0]);
			
		    long maioresQMedia =  Arrays.stream(valores).mapToInt(v ->  Integer.parseInt(v) ).skip(1).filter( v -> v > media ).count()  ;
		    
		    double percentual = (double) ( maioresQMedia / Double.parseDouble(valores[0]))*100  ;
		    System.out.println(String.format("%.3f",percentual)+"%");
			
			
		}
	
		
		
		

	}

}
