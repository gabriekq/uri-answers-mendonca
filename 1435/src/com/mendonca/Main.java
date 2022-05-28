package com.mendonca;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		
		while(true) {
			
			int tamanhoMatriz = Integer.parseInt(console.nextLine());
			
			if(tamanhoMatriz ==0) {
				break;
			}
			// funciona mas reclama de tempo
			Integer martriz[][] = new Integer [tamanhoMatriz][tamanhoMatriz];
			
			for(int linha=0;linha<martriz.length;linha++) {
				
				for(int coluna=0;coluna<martriz.length;coluna++) {
				
				if(coluna==0) {
					
					System.out.printf("%3d",CalculaNumero(linha, coluna, martriz.length-1));
				  
				}else {
				
					System.out.printf(" %3d",CalculaNumero(linha, coluna, martriz.length-1));
				}	
			}
				 System.out.println();
	     }
			
		}
		System.out.println();

	}
	
	public static int CalculaNumero(int linha, int coluna , int tamanho) {
		
		int referenciaColuna = tamanho - coluna;
		
		int referenciaLinha = tamanho - linha;
		
        int referenciaColunaF = coluna  - 0 ;
		
		int referenciaLinhaF =  linha - 0 ;
		
	
		int menor1 =  referenciaColuna < referenciaLinha ? referenciaColuna : referenciaLinha;
		int menor2 =  referenciaColunaF < referenciaLinhaF ? referenciaColunaF : referenciaLinhaF;
		
		int saida = menor1 < menor2 ? menor1: menor2;
		
		
		return  saida+1  ;
	}
	
	
	

}
