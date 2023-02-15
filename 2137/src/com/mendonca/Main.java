package com.mendonca;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<>();
		
		while(console.hasNext()) {
			
			String nCasesInput = console.nextLine();
			int nCases = Integer.parseInt(nCasesInput);
			
			for(int index=0;index<nCases;index++) {
				
				String value = console.nextLine();
				values.add(Integer.parseInt(value));
			}
			values.stream().sorted( Comparator.naturalOrder() ).map( value -> String.valueOf(value)).forEachOrdered( number -> System.out.println(alinNumbers(number)));
			values.clear();	
		}
	}

	private static String alinNumbers(String number) {
		
		if(number.length() < 4) {
		
			StringBuilder result = new StringBuilder();
			int diffZeros = 4 - number.length();
		
			for(int index=0;index<diffZeros;index++) {
				result.append("0");
			}
			return result.toString()+number;
			
		}
		
		return number;
	}
	
	
	

}
