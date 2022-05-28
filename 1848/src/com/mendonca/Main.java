package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		Map<String, Integer> corvo = new HashMap<String, Integer>();
		
		corvo.put("---", 0);
		corvo.put("--*", 1);
		corvo.put("-**", 3);
		corvo.put("***", 7);
		
		corvo.put("*--", 4);
		corvo.put("**-", 6);
		corvo.put("*-*", 5);
		corvo.put("-*-", 2);
		
		int soma=0;
		while(true) {
			
			if(console.hasNext()) {
				
			 String input =	console.nextLine();
				
			 if(input.contains("caw")) {
				 System.out.println(soma);
	             soma = 0;
			 }else {	 
				 soma = soma + (corvo.containsKey(input) == true ? corvo.get(input) : 0);
			 }
				
		}else {
		    break;
		}
		
	 }
		
		
		
		
		

	}

}
