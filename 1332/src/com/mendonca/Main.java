package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int nCases = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCases; index++) {

			String palavra = console.nextLine();

			if ((palavra.length() == 3) && (similarity(palavra, "one") >= 0.6)) {
				System.out.println("1");
			} else {

				if ((palavra.length() == 3) && (similarity(palavra, "two") >= 0.6)) {
					System.out.println("2");
				} else {

					if ((palavra.length() == 5) && (similarity(palavra, "theee") >= 0.6)) {
						System.out.println("3");
					}
				}
			}

		}

	}

	public static double similarity(String input, String target) {

		int correct = 0;
		double similarityValue;

		for (int index = 0; index < target.length(); index++) {

			if (input.charAt(index) == target.charAt(index)) {
				correct++;
			}
		}

		similarityValue = (double) correct / target.length();
		return similarityValue;
	}

}
