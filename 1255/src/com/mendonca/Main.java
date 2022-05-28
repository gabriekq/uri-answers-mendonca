package com.mendonca;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		TreeMap<String, Integer> letras = new TreeMap<String, Integer>();
        StringBuilder stringBuilder =  new StringBuilder();
		
		int nCases = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCases; index++) {

			String input = console.nextLine();
			
		    String vetorPalvras[] = input.toLowerCase().split("([ ])+");
		    
		  Arrays.stream(vetorPalvras).forEach( word -> stringBuilder.append(word));		          
		  stringBuilder.toString().chars().forEach(l ->  incereLetras(letras ,String.valueOf((char)l )) );
		 	
	      int max = letras.values().stream().mapToInt(a ->  a  ).max().getAsInt();    
	      letras.entrySet().removeIf(e -> e.getValue() < max    );
		  letras.keySet().forEach( l -> System.out.print(l)  ); 
		  System.out.println();
		  
		  letras.clear();
		  stringBuilder.setLength(0);

		}
		
		
		
		

	}

	public static void incereLetras(TreeMap<String, Integer> letras, String letra) {

		if (letras.containsKey(letra)) {

			int newValue = letras.get(letra) + 1;
			letras.put(letra, newValue);
		} else {
			letras.put(letra, 1);
		}
	}
	
  
	
	

	
}
