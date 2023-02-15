package com.mendonca;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args)  throws IOException {
		
		Scanner console = new Scanner(new File("c:\\file.txt")); // works but uri does not aceepted 
	//	Scanner console = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		
		int nCases = Integer.parseInt(console.nextLine());
		
        for(int index=0;index<nCases;index++ ) {
        	
        	String numbersValues = console.nextLine();
        	
        	String valuesInput  = console.nextLine();
        	
        	Integer[] values = Stream.of(valuesInput.split(" ")).map( value ->  Integer.parseInt(value)  ).toArray(Integer[]::new);       	
        	Arrays.sort( values);

           Stream.of(values).forEachOrdered(number ->   result.append(number+" ") );
        	System.out.println(result.toString().trim());
        	result.setLength(0);
        	
        
        	
        }
		console.close();
		
		
	}

}
