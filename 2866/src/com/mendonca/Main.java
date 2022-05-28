package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//https://www.urionlinejudge.com.br/judge/pt/problems/view/2866
		
		Scanner console = new Scanner(System.in);
		
		int nCases =  Integer.valueOf(console.next());
		
		for (int index=0;index < nCases;index++) {
			
			String input = console.next();
			input = input.replaceAll("([A-Z])+", "");
			StringBuilder sb = new StringBuilder(input);
			System.out.println(sb.reverse().toString());	
		}
		
		
		

	}

}
