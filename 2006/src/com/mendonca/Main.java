package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, Integer> chas = new  HashMap<Integer, Integer>();
		Scanner console = new Scanner(System.in);
		
		String valorPesq = console.nextLine();
		
		String valores = console.nextLine();
		
		Stream.of(valores.split(" ")).map( v -> Integer.parseInt(v)).forEach( a -> insertHashMap(chas,a) );
		
		System.out.println(chas.getOrDefault(Integer.parseInt(valorPesq), 0));
		
		

	}
	
	
	public static void insertHashMap (Map<Integer, Integer> chas , int valorKey ) {
		
		if(chas.containsKey(valorKey)) {
			
			int contador = chas.get(valorKey) + 1;
			chas.put(valorKey, contador);
			
		}else {
			chas.put(valorKey, 1);
		}
	}
	
	
	
	

}
