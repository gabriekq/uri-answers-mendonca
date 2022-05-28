package com.mendonca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.math.BigInteger;

public class App {
	// https://www.urionlinejudge.com.br/judge/pt/problems/view/1073
	public static void main(String[] args) throws IOException {
		
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		 int input =   Integer.valueOf(reader.readLine());
		
		 for(int index=1;index <= input; index++ ){
			
			 if(index % 2 == 0) {
				 
				 BigInteger quadrado = new BigInteger(String.valueOf(index));
				 quadrado = quadrado.pow(2);
				 System.out.println(index+"^2 = "+quadrado);
			 }
			  
		 }	 
	}

}
