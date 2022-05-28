package com.mendonca;

import java.util.Scanner;

public class Main {
     // https://www.urionlinejudge.com.br/judge/pt/problems/view/1871
	public static void main(String[] args) {
		
		 Scanner console = new Scanner(System.in);
		 
		 do {
			 
		int value1 = console.nextInt();
		
		int value2 = console.nextInt();
			 
			 
		if( (value1 != 0) && (value2 != 0)  ) {
			
		int soma  = value1 + value2;
		 String saida   = String.valueOf(soma);
		
		 saida = saida.replace("0", "");
		 System.out.println(saida);
			
		}else {
			break;
		}
		 
	}while(true);

	}

}
