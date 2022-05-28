package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		while(true) {
			
			double valor = Double.parseDouble(console.nextLine());
			
			if( ((valor >= 0) &&  (valor <= 10))  ) {	
				numeros.add(valor);
				if(numeros.size()==2) {
					System.out.println("media = "+(numeros.get(0)+numeros.get(1))/2 );
					break;
				}
							
			}else {
				System.out.println("nota invalida");
			}	
		}
		
		
		
		

	}

}
