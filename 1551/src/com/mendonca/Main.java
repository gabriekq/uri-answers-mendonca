package com.mendonca;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int nCases = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCases; index++) {

			String input = console.nextLine();

			input = input.replaceAll(",", "").replaceAll(" ", "");

			int numLetters = countInput(input);

			if (numLetters == 26) {
				System.out.println("frase completa");
			} else {

				if (numLetters > (26 / 2)) {
					System.out.println("frase quase completa");
				} else {
					System.out.println("frase mal elaborada");
				}

			}

		}

	}

	private static int countInput(String input) {

		HashSet<Character> letters = new HashSet<Character>();

		for (int index = 0; index < input.length(); index++) {

			letters.add(input.charAt(index));

		}

		return letters.size();
	}

}
