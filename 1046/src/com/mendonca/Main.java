package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String valor = console.nextLine();
		
		String valores[] = valor.split(" ");
		
		System.out.println("O JOGO DUROU "+tempoHoras( Integer.parseInt(valores[0])  ,Integer.parseInt(valores[1])) +" HORA(S)");
	}

	public static int tempoHoras(int inicio, int fim) {
		
		int duracao =0;
		
	do {
		
		inicio=inicio+1;
		if(inicio > 23) {
			inicio=0;
		}
		duracao++;
		
		
		if(inicio==fim){
			break;
		}
		
	}while(true);
		
		return duracao;
	}
	
	
	
	
}
