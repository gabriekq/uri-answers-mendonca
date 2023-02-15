package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner console = new Scanner(System.in);
		
		//Scanner console = new Scanner(new File("c:\\file.txt"));
		
		while(console.hasNext()) {
			
			String valueInput = console.nextLine();
			
			String valuesInput = console.nextLine();
			
		   long maxValue =	Stream.of(valuesInput.split(" ")).map( numberText -> Integer.parseInt(numberText)   ).max( Comparator.naturalOrder()    ).get();
			
		     int level = verifyLevel(maxValue);
			  System.out.println(level);		
		}
		
		
		

	}

	private static int verifyLevel(long value) {
		
		
		if(value >= 20) {
			return 3;
		}
		
		
		if(value < 10) {
			return 1;
		}
		
		return 2;
	}

}
