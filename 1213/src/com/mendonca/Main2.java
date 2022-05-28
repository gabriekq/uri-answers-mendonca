package com.mendonca;


import java.math.BigInteger;
import java.util.Scanner;
 
public class Main2 {
 
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

	         BigInteger bigInteger = new BigInteger("1");
		
		while ( bigInteger.mod(valorInput)  != BigInteger.ZERO  ) {
			bigInteger = bigInteger.multiply(BigInteger.valueOf(10)).add(BigInteger.ONE);
	
		}
           return bigInteger.toString().length();
	}
    
 
}