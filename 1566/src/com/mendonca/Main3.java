package com.mendonca;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) throws IOException {

		//Scanner console = new Scanner(new File("c:\\file.txt")); // works but uri does not aceepted
	    Scanner console = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<>();

		int nCases = Integer.parseInt(console.nextLine());

		for (int indexCases = 0; indexCases < nCases; indexCases++) { // cases

			int nNumbers = console.nextInt();

			for (int indexNumbers = 0; indexNumbers < nNumbers; indexNumbers++) {

				int number = Integer.parseInt(console.next());

				
					values.add(number);
					values.sort((num1, num2) -> num1.compareTo(num2));
				

				}

			System.out.println(values.toString().replace(",", "").replace("[", "").replace("]", ""));
			values.clear();
			}
			
		}

	


	

}
