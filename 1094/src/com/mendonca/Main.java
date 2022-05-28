package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		Map<String, Integer> itens = new HashMap<String,Integer>();

		int nCases =  Integer.parseInt(console.nextLine());
		
		for(int index=0;index < nCases;index++) {
			
			String input = console.nextLine();		
			String []inputs = input.split("([ ])+");	
			addItem(itens, Integer.parseInt(inputs[0]), inputs[1] );
		}

		  int totalCobaias = itens.get("C") + itens.get("R")+ itens.get("S") ;
		  
          double percentCoelho =  ((double) itens.get("C") / totalCobaias)*100;
          double percentRatos =   ((double) itens.get("R") / totalCobaias)*100;
          double percentSapos =   ((double)  itens.get("S") / totalCobaias)*100;
          
          System.out.println("Total: "+totalCobaias+" cobaias");
          System.out.println("Total de coelhos: "+itens.get("C"));
          System.out.println("Total de ratos: "+itens.get("R"));
          System.out.println("Total de sapos: "+itens.get("S"));
      
          System.out.println("Percentual de coelhos: "+String.format("%.2f", percentCoelho)+" %");
          System.out.println("Percentual de ratos: "+ String.format("%.2f", percentRatos)+" %");
          System.out.println("Percentual de sapos: "+String.format("%.2f", percentSapos)+" %");
          

	}

	public static void addItem(Map<String,Integer> itens,int qdt,String animal) {
		
		if(itens.get(animal) != null  ) {

		int valor =	itens.get(animal)+qdt;
		itens.put(animal, valor);
		}else {
			itens.put(animal, qdt);	
		}
	}
	
	
	
	
	
	
}
