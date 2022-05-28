package com.mendonca;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt( console.nextLine());
		
		for(int index=0;index <nCases;index++ ) {
			
		String input = console.nextLine();		
	    List<String> valores = Stream.of(input.split("")).collect(Collectors.toList());

	    int retorno =  calcula( Integer.parseInt(valores.get(0))   ,Integer.parseInt(valores.get(2)) ,valores.get(1));
	    System.out.println(retorno);
			
		}
		
	
	    
	    
	    
	}
	
	public static int calcula(int valor1,int valor2,String letra) {			
		return  valor1== valor2 ? valor1*valor2 :  letra.toLowerCase().equals(letra) ? valor1+valor2 : valor2- valor1;
	}
	
	
	

}
