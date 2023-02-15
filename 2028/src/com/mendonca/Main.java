package com.mendonca;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner console = new Scanner(System.in); 
		
	// Scanner console = new Scanner(new File("c:\\file.txt"));
	 
		int currentLine=1;
		while(console.hasNext()) {
			
			
			String value = console.nextLine();
			String sumOfDigits = createStrings(Integer.parseInt(value));
			
			String numero = sumOfDigits.split(" ").length == 1 ? sumOfDigits.split(" ").length+" numero" : sumOfDigits.split(" ").length+" numeros";
			
			System.out.println("Caso "+currentLine+": "+numero);
			
			System.out.println(sumOfDigits);
			currentLine++;
			
			if(console.hasNext()) {
				System.out.println();
			}
			
		}
		System.out.println();
	}

	private static String createStrings(int valueInput) {
			
		if(valueInput==0) {
			return "0";
		}
		
		if(valueInput==1) {
			return "0 1";
		}
		
		StringBuilder result = new StringBuilder();
			
		for(int index=0; index <= valueInput; index++   ) {
			
			if(index<=1) {
				result.append(index+" ");
				continue;
			}
			
			for(int indexInner=0;indexInner < index ;indexInner++ ) { 
				result.append(index+" ");
			}	
		}
		
		return result.toString().trim();
	}

}
