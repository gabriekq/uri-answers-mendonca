package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String input = console.nextLine();
		
		if(input.length() <= 80 ) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
		
		

	}

}
