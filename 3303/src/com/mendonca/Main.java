package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);		
		String input = console.nextLine();
		String saida = input.length() >= 10 ? "palavrao":"palavrinha";
		
		System.out.println(saida);
		
		

	}

}
