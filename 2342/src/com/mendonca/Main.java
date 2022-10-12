package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		
		Map<String, BiFunction<Integer, Integer, Integer>> funcoesMap = new HashMap<String, BiFunction<Integer, Integer, Integer>>();	
		funcoesMap.put("+", (a, b) -> a + b);
		funcoesMap.put("*", (a, b) -> a * b);		
		Scanner console = new Scanner(System.in);
		
		int result = Integer.parseInt(console.nextLine());	
		String input = console.nextLine();
		
		String output = funcoesMap.get(input.split(" ")[1]).apply( Integer.parseInt(input.split(" ")[0]) ,  Integer.parseInt(input.split(" ")[2])) > result ?  "OVERFLOW"  : "OK";		
		System.out.println(output);	

	}
	
	
	
	
	
	

}
