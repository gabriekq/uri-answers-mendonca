package com.mendonca;

import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
	// https://www.urionlinejudge.com.br/judge/pt/problems/view/1241
		Scanner console = new Scanner(System.in);
	       
		int nCases =Integer.parseInt(console.next());
		String principal=null,comparar=null ;
		
		for(int index= 0; index < nCases;index++   ) {
			
			
	      principal = console.next();
		  
			
		  comparar = console.next();
		
		if(principal.length() > comparar.length()  ) {
			
		String  conparator = principal.substring(principal.length()-comparar.length() , principal.length());
		
		String Saida = comparar.equals(conparator) ? "encaixa": "nao encaixa";
		System.out.println(Saida);
	
		}else {
			
			if(principal.length() == comparar.length() ) {
			String saida = principal.equals(comparar) ? "encaixa": "nao encaixa";
			System.out.println(saida);
			}else {
				System.out.println("nao encaixa");
			}		
		  }		
	   }
		
	}

}
