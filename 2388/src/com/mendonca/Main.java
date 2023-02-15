package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
	
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		ArrayList<Long> values = new ArrayList<Long>();
		ArrayList<Long> values2 = new ArrayList<Long>();
		long result =0;
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index<nCases;index++) {
			
		  String input = 	console.nextLine();
		  String inputValues[] = input.split(" ");
		  
		  values.add(Long.parseLong(inputValues[0]));
		  values2.add(Long.parseLong(inputValues[1]));	
		}

		for(int index=0;index<values.size();index++) {		
			result = result +	(values.get(index) * values2.get(index));
		}
		
		System.out.println(result);
	}

}
