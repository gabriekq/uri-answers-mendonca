package com.mendonca;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	// https://stackoverflow.com/questions/7860822/sorting-hashmap-based-on-keys
	// https://www.beecrowd.com.br/judge/pt/problems/view/1171
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner console =   new Scanner(System.in);
				
		TreeMap<Integer, Integer> valores  = new TreeMap<Integer, Integer>();
		
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index<nCases;index++) {
			
			int valorInput = Integer.parseInt(console.nextLine());
			incereMap(valores,valorInput);
		}
		
		
		for (Map.Entry<Integer, Integer> entry : valores.entrySet()) {
		    System.out.println(entry.getKey() + " aparece "+entry.getValue()+" vez(es)" );
		}
	}

	
	public static void incereMap(Map< Integer , Integer> valores,int valor ) {
		
		if(valores.get(valor)!=null) {
			
			int countValor = valores.get(valor)+1;
			
			valores.put(valor, countValor);
			
		}else {
			valores.put(valor, 1);
		}	
	}
	
	
}
