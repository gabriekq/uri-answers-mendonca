package com.mendonca;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner console = new Scanner(System.in);
		
		String value = console.nextLine();
		
		String finalResult = evaluateTop(Integer.parseInt(value));
		System.out.println(finalResult);

	}

	
	private static String evaluateTop(int valueInsert) {
		
		if( (valueInsert > 1) &&  (valueInsert<=3)  ) {
			return "Top 3";
		}
		
		if( (valueInsert > 3) &&  (valueInsert<=5)  ) {
			return "Top 5";
		}
		
		if( (valueInsert > 5) &&  (valueInsert<=10)  ) {
			return "Top 10";
		}
		
		if( (valueInsert > 10) &&  (valueInsert<=25)  ) {
			return "Top 25";
		}
		
		if( (valueInsert > 25) &&  (valueInsert<=50)  ) {
			return "Top 50";
		}
		
		if( (valueInsert > 50) &&  (valueInsert<=100)  ) {
			return "Top 100";
		}
		
		return "Top 1";
	}

}
