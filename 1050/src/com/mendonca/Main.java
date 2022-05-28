package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		Map<String,String> DDD = new HashMap<String,String>();
		
		DDD.put("61","Brasilia");
		DDD.put("71","Salvador");
		DDD.put("11","Sao Paulo");
		DDD.put("21","Rio de Janeiro");
		DDD.put("32","Juiz de Fora");
		DDD.put("19","Campinas");
		DDD.put("27","Vitoria");
		DDD.put("31","Belo Horizonte");

		String chave =   console.nextLine();
		
		if(DDD.get(chave) != null) {
		System.out.println(DDD.get(chave));
		}else {
			System.out.println("DDD nao cadastrado");
		}
		
		
		
	}

}
