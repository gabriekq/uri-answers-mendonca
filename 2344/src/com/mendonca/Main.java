package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner console = new Scanner(System.in);
		
		int score = Integer.parseInt(console.nextLine());
		
		String result = evaluateScore(score);
		System.out.println(result);
		

	}

	private static String evaluateScore(int score) {
		
		if((score >= 1) &&   (score <= 35)  ) {
			return "D";
		}
		
		if((score >= 36) &&   (score <= 60)  ) {
			return "C";
		}
		
		
		if((score >= 61) &&   (score <= 85)  ) {
			return "B";
		}
		
		if((score >= 86) &&   (score <= 100)  ) {
			return "A";
		}
		
		return "E";
	}
	
	
	
	
	

}
