package com.mendonca;

import java.util.Scanner;

public class Main {

	// https://www.beecrowd.com.br/judge/pt/problems/view/1048
	
	
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		double valor = Double.parseDouble(console.nextLine());
		calcular(valor);
		
	}

	
	public static void calcular(double valor) {
		
		double novoSalario=0, reajusteGanho=0;
		int percentual=0;
		
		if( (valor >= 0)  &&    (valor <= 400.00) ) {
			
			novoSalario = valor*1.15;
			reajusteGanho = novoSalario - valor;
			percentual = 15;	
		}else {
			
			if( (valor>=  400.01)   &&  (valor <= 800.00) ) {
				novoSalario = valor*1.12;
				reajusteGanho = novoSalario - valor;
				percentual = 12;	
			}else {
				
				if( (valor>=  800.01)   &&  (valor <= 1200.00) ) {
					novoSalario = valor*1.10;
					reajusteGanho = novoSalario - valor;
					percentual = 10;
				}else {
					
					if( (valor>=  1200.01)   &&  (valor <= 2000.00) ) {
						novoSalario = valor*1.07;
						reajusteGanho = novoSalario - valor;
						percentual = 7;
					}else {
						novoSalario = valor*1.04;
						reajusteGanho = novoSalario - valor;
						percentual = 4;
					}	
				}	
			}
		}
		
		
		System.out.println("Novo salario: "+String.format("%.2f",novoSalario ) );
		System.out.println("Reajuste ganho: "+String.format("%.2f",+reajusteGanho));
		System.out.println("Em percentual: "+percentual+" %");
		
	}
	
	
	
	
}
