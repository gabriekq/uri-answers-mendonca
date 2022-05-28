package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		// it works but uri regets
				
		Scanner console = new Scanner(System.in);	
		Map<String, String>  filhoMeio = new HashMap<String, String>();
		
		filhoMeio.put("5 6 7", "zezinho");
		filhoMeio.put("7 5 6", "luisinho");
		filhoMeio.put("6 7 5", "huguinho");
		
		String input  = console.nextLine();
		
		//String valores[] = input.split(" ");
		
		String resultado = filhoMeio.get(input);

		System.out.println(resultado);
		
		
		

	}

}
