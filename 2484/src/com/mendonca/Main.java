package com.mendonca;


import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

	//	Scanner console = new Scanner(new File("c:\\file.txt"));

		Scanner console = new Scanner(System.in);
		
		while (console.hasNext()) {

			String word = console.nextLine();

			createSentence(word);

			System.out.println();

		}

	}

	private static void createSentence(String word) {

		String spaces = "";
		int countSpaces = 0;
		StringBuilder result = new StringBuilder();

		do {

			for (int index = 0; index < word.length() - countSpaces; index++) {

				result.append(word.charAt(index) + " ");

			}

			System.out.println(spaces + result.toString().trim());
			result.setLength(0);

			spaces = spaces + " ";
			countSpaces++;

		} while (word.length() != countSpaces);

	}

}
