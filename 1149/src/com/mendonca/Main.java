package com.mendonca;

import java.util.Scanner;

public class Main {

	// https://www.beecrowd.com.br/judge/pt/problems/view/1149  submeter depois
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int soma =0 ;
		
		
		String input = console.nextLine();
		
		String inputs[] =  input.split("([ ])+");
		
		for(int index=0;index <  Integer.parseInt(inputs[inputs.length-1]) ;index++) {			
			soma = soma +  (Integer.parseInt(inputs[0])+index);
		}
		
		System.out.println(soma);
		
		

	}

}
