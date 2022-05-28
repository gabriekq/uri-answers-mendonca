package com.mendonca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class App {

	public static void main(String[] args) throws IOException {
		
	   // https://www.urionlinejudge.com.br/judge/pt/problems/view/1037   
		
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		 BigDecimal valor =  new BigDecimal(reader.readLine());
		 
		 if( ((valor.compareTo( new BigDecimal("0"))==0) ||  (valor.compareTo( new BigDecimal("0"))==1)) &&
		     ((valor.compareTo( new BigDecimal("25.0000"))==0) ||  (valor.compareTo( new BigDecimal("25.0000"))==-1)) ) {
			 System.out.println("Intervalo [0,25]");
		 }else {
			 
			 if( (valor.compareTo( new BigDecimal("25.00001"))==1) && 
		      (valor.compareTo( new BigDecimal("50.0000000"))==-1  || valor.compareTo( new BigDecimal("50.0000000"))==0 )        ) {
				 System.out.println("Intervalo (25,50]");
			 }else {
				 
				 if( ((valor.compareTo( new BigDecimal("75.0000000"))==0) ||  (valor.compareTo( new BigDecimal("75.0000000"))==1))&&
				     ((valor.compareTo( new BigDecimal("100.0000"))==0) ||  (valor.compareTo( new BigDecimal("100.0000"))==-1))	
				   ){
					 
				     System.out.println("Intervalo (75,100]");
				   }else {
					 System.out.println("Fora de intervalo");
				   } 
			 }	  
		 }
		 
		 
		 

	}

}
