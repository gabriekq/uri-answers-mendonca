package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		StringBuilder saida = new StringBuilder();
		
		
		int nCasos = Integer.valueOf(console.next());
		
		for(int index=0;index < nCasos;index++) {
			
		
			int value1 =	Integer.valueOf(console.next());
			
		    int value2 =	Integer.valueOf(console.next());
		
		
		     for(int indexAsc=value1; indexAsc <=value2;indexAsc++   ) {
		    	saida.append(indexAsc);
		     }
			
		     for(int indexAsc=value2; indexAsc >= value1 ; indexAsc--   ) {
			    	
		    	 StringBuilder tmp = new StringBuilder();
		    	 tmp.append(indexAsc);
		    	 
		    	 saida.append(tmp.reverse().toString());
			     }
		     
			System.out.println(saida.toString());
			saida.setLength(0);
			
		}
		
		
		
		

	}

}
