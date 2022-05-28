package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// it works but uri regets
				
		Scanner console = new Scanner(System.in);	
		Map<String, String>  filhoMeio = new HashMap<String, String>();
		
		filhoMeio.put("6", "zezinho");
		filhoMeio.put("5", "luisinho");
		filhoMeio.put("7", "huguinho");
		
		String input  = console.nextLine();
		
		String valores[] = input.split(" ");
		
		String resultado = filhoMeio.get(valores[1]);

		System.out.println(resultado);
		
		
		

	}

}
