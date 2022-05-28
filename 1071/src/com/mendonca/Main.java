package com.mendonca;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
	Scanner console = new Scanner( System.in);
	
      int valor1 =  console.nextInt();
	
      int valor2 =  console.nextInt();
	
	
      int menor   = valor1 < valor2 ? valor1 : valor2;
      int maior   = valor1 > valor2 ? valor1 : valor2;
	  int soma=0;
      
      for (int index = menor + 1; index < maior; index++) {
			if (index % 2 != 0) {
				soma += index;
			}
		}
      
      System.out.println(soma);
      
      
	}

}
