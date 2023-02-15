package com.mendonca;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		
		String values = console.nextLine();
		
		String numbers[] =	values.split(" ");
		
		
		int result = evaluateNumbers( Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]),Integer.parseInt(numbers[2]),Integer.parseInt(numbers[3])  );
		
		System.out.println(result);
		

	}

	private static int evaluateNumbers(int P1, int C1, int P2, int C2) {
		
		if((P1 *C1) == (P2 * C2)) {
			return 0;
		}
		

		if((P1 *C1) < (P2 * C2)) {
			return 1;
		}
		
		
		return -1;
	}

}
