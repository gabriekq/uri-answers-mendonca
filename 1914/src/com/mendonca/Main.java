package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in); 
		Map<String, String> textTime = new HashMap<String, String>();
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index < nCases;index++) {
			
			String textInput = console.nextLine();
			
			String numberInput = console.nextLine();
			
			String textVetor[] = textInput.split(" ");
			int sumNumbers = Stream.of( numberInput.split(" ")).map( elem -> Integer.parseInt(elem)).reduce((num1,num2) -> num1 + num2  ).get();
			
			textTime.put(textVetor[1], textVetor[0]);
			textTime.put(textVetor[3], textVetor[2]);
			
			String result = sumNumbers%2==0 ?  textTime.get("PAR") : textTime.get("IMPAR");
			System.out.println(result);
			
			textTime.clear();
			
		}
		
		
		

	}

}
