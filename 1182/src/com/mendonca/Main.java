package com.mendonca;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) throws IOException {
		 
	     Scanner console = new Scanner(System.in);
			Double [][] matriz = new Double[12][12] ;
			
			int linhaP =  Integer.parseInt(console.nextLine());
			String operacao =  console.nextLine();
			
			for(int indexLinha=0;indexLinha< 12;indexLinha++  ) {
				
				for(int indexColuna=0; indexColuna<12;indexColuna++ ) {
					matriz[indexLinha][indexColuna] = Double.parseDouble(console.nextLine());
					
				}	
			}
			calcula(matriz,operacao,linhaP);
	 
	    }
	    
	    public static void calcula(Double [][] matriz,String operacao, int linhaP) {
			double soma=0;
			int contaMedia=0;
			
			for(int indexColuna=0;indexColuna<12;indexColuna++  ) {
										
					 soma =  soma + matriz[linhaP][indexColuna];
					contaMedia++; 

			}
			
			if(operacao.equalsIgnoreCase("M")) {
				double media = soma /contaMedia;
				System.out.println(String.format("%.1f", media));
			}else {
				System.out.println(String.format("%.1f",soma));
			}
		}
	
	
	
}
