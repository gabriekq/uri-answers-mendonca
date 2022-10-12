package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int contMachs=0;
		
		Map< Integer , String> lottery = new HashMap<Integer, String>();
		lottery.put(3, "terno");
		lottery.put(4, "quadra");
		lottery.put(5, "quina");
		lottery.put(6, "sena");
				
		String input1 = console.nextLine();			
		String input2 = console.nextLine();
		
		String elements[] = input2.split(" ");
		
		
		for(String elem  : input1.split(" ")) {
			
			boolean containsElem = veryfildElement(elem,elements);
			
			if(containsElem) {
				contMachs++;
			}

		}

		System.out.println(lottery.getOrDefault(contMachs, "azar"));
	}
	
	

	public static boolean veryfildElement(String value, String[] elements) {
		return Stream.of(elements).parallel().anyMatch(elem ->  elem.equals(value));  
	}
	
	

}
