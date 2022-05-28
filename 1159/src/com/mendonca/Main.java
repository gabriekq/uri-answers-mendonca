package com.mendonca;

import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {
		
		  Scanner console = new Scanner(System.in);
		  
		  while(true) {
			  
			  long valor =  Long.parseLong(console.nextLine());
			  
			if(valor == 0) {
				break;
			}else {
				  somaConsecutivo(valor);
			}  
		  }
	}
	  
	  
	  public static void somaConsecutivo(long valor) {
		  
		  long soma=0;
		  valor = valor % 2 != 0 ? valor = valor +1 : valor;
		  
		  for(long index=valor;index<valor+10;index = index +2) {
			  soma = soma + index;  
		  }
		  System.out.println(soma);
	  }

}
