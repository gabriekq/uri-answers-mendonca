package com.mendonca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;


public class App {

	public static void main(String[] args) throws IOException {
		//https://www.urionlinejudge.com.br/judge/pt/problems/view/1038
				
		
		 double[] table =  {4.00,4.50,5.00,2.00,1.50};
		 BigDecimal totalValue = new BigDecimal("0.00");
		 DecimalFormat df = new DecimalFormat("#,###.00");
		 
	
		 int code =0;
		 
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
	     
		  String[] inputs = reader.readLine().split("([ ])+");
		 
		  code = Integer.valueOf(inputs[0]) - 1 ;
		 
		  totalValue =  new BigDecimal(table[code]).multiply( new BigDecimal(Integer.valueOf(inputs[1])) )   ;
	     
	     System.out.println("Total: R$ "+df.format(totalValue));
	     
	}

}
