package com.mendonca;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException  {
	
		//Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		
		ArrayList<Integer> valuesNumbers = new ArrayList<>();
		ArrayList<String> valuesNames = new ArrayList<>();
		
		
		while (console.hasNext()  ) {
			
			String name = console.nextLine();
			
			String number = console.nextLine();
			
			valuesNumbers.add(Integer.parseInt(number));
			valuesNames.add(name);
			
		}
			
	    double finalResult = valuesNumbers.stream().reduce( (valueA , valueB) -> valueA+valueB ).get() / ( valuesNames.size() * 1.00 )  ;    
	    System.out.println(String.format("%.1f", finalResult));

	}

}
