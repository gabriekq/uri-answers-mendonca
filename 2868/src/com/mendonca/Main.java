package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;


public class Main {

	public static void main(String[] args) {
		
		Map<String, BiFunction<Integer, Integer, Integer>>  calcs = new HashMap<String, BiFunction<Integer,Integer,Integer>>();
		Scanner console  = new Scanner(System.in);
			
		calcs.put("+", (num1, num2) -> num1 + num2    );
		calcs.put("-", (num1, num2) -> num1 - num2    );
		calcs.put("x", (num1, num2) -> num1 * num2    );
		
		
		int nCases =  Integer.parseInt( console.nextLine());
		
		for(int index=0; index< nCases; index++   ) {
			
			String expression = console.nextLine();
			
			String values[] = expression.split(" ");
			
			int expressionResult = calcs.get( values[1]).apply( Integer.parseInt(values[0]), Integer.parseInt(values[2]));
			int inputResult = Integer.parseInt(values[4]);
			
			int max = expressionResult > inputResult ? expressionResult : inputResult;
			int min = expressionResult < inputResult ? expressionResult : inputResult;
			
			int diff = max - min;

			System.out.println(createErrou(diff));
			
		}

	}

	private static String createErrou(int diff) {
		
		StringBuilder word = new StringBuilder("E");
		
		for(int index=0;index < diff;index ++) {
			word.append("r");
		}
		word.append("ou!");
		
		
		return word.toString();
	}
	
	
	
	

}
