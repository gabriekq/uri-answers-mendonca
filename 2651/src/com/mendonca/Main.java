package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String value = console.nextLine();
		
		
		if(value.toLowerCase().contains("zelda")) {
			System.out.println("Link Bolado");
		}else {
			System.out.println("Link Tranquilo");
		}
		
		
		

	}

}
