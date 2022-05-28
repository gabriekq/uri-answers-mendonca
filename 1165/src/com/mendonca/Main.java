package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		
		int Ncasos =  console.nextInt();
		
		for(int index =0; index < Ncasos; index++    ) {
			
		int valor = console.nextInt();
		int primo =0 ;
		
			
			for(int indexVal=2 ; indexVal < valor; indexVal++   ) {
				
			    if(  valor %  indexVal  == 0 ) {
			    	primo++;
			    }		
			}
			
			if(primo==0) {
				System.out.println(valor+" eh primo");
			}else {
				System.out.println(valor+" nao eh primo");
			}		
		}
		
		
		
		
		

	}

}
