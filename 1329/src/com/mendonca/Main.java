package com.mendonca;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		
		  while(true) {
			
		   String value =  	console.nextLine();
		   
		   if(Integer.parseInt(value) == 0 ) {
			   break;
		   }
			
		   String values = console.nextLine();
		   String valuesVector[] = values.split(" ");
		   
		  long countZero = Stream.of(valuesVector).filter( number -> number.equalsIgnoreCase("0")   ).count();
		  long countOne = Stream.of(valuesVector).filter( number -> number.equalsIgnoreCase("1")   ).count();
		  System.out.println("Mary won "+countZero+" times and John won "+countOne+" times"); 
		  
		  
			
		}
		
		

	}

}
