package com.mendonca;


import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
    		Scanner console = new Scanner(System.in); // tempo exedido mas resultado ok

		while (true) {

			if (console.hasNext()) {
				long valor = console.nextLong();
                
				
				
			System.out.println(	calcular(BigInteger.valueOf(valor))   );

			} else {
				break;
			}
		}
 
    }
    
    	private static int calcular( BigInteger valorInput) {

		String numerosReferencia = "1";	
		
	
	
		while ( new BigInteger(numerosReferencia).mod(valorInput).intValue() != 0   ) {

			
				numerosReferencia =	numerosReferencia.concat("1");
		}
	
           return numerosReferencia.length();
	}
    
 
}