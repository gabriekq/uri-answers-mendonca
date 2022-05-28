package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	//	https://www.beecrowd.com.br/judge/pt/problems/view/1184 abaixo e assima
		
		//1185 //1186
		
		Scanner console = new Scanner(System.in);
		Double [][] matriz = new Double[12][12] ;
		String operacao =  console.nextLine();
		
		for(int indexLinha=0;indexLinha< 12;indexLinha++  ) {
			
			for(int indexColuna=0; indexColuna<12;indexColuna++ ) {
				matriz[indexLinha][indexColuna] = Double.parseDouble(console.nextLine());
				
			}	
		}
		calcula(matriz,operacao);
	}
	
	
	public static void calcula(Double [][] matriz,String operacao) {
		double soma=0;
		int contaMedia=0;
		
		for(int indexLinha=1;indexLinha<12;indexLinha++  ) {
			
			for(int indexColuna=6; indexColuna<12;indexColuna++ ) {

				  if(indexLinha > 5) {
					  
					 if(indexColuna > indexLinha ) {
						 soma =  soma + matriz[indexLinha][indexColuna];
							contaMedia++; 
					 } 
					  
				  }else {
					  
					  
					if(   indexColuna  >=  (12 - indexLinha)    ) {
					soma =  soma + matriz[indexLinha][indexColuna];
					contaMedia++;
				    }  
					  
				  }
			}
		}
		
		if(operacao.equalsIgnoreCase("M")) {
			double media = soma /contaMedia;
			System.out.println(String.format("%.1f", media));
		}else {
			System.out.println(String.format("%.1f",soma));
		}
	}
	
	
	

}
