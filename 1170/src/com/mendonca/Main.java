package com.mendonca;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		
		String nCases = console.nextLine();
		
		for(int index=0;index < Integer.parseInt(nCases);index++  ) {
			
			String value = console.nextLine();
			String result = calculateDays(Double.parseDouble(value));
			
			System.out.println(result);	
		}
		
	}

	private static String calculateDays(double foodInKg) {
		
		int days=0;
		StringBuilder result = new StringBuilder();
		
		 while(foodInKg > 1.0){
			foodInKg = foodInKg / 2;
			days = days + 1;
			
		}
		result.append(days+" dias");
		
		return result.toString();
	}

}
