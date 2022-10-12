package com.mendonca;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		 Scanner console = new Scanner(System.in);

		//Scanner console = new Scanner(new File("c:\\file.txt"));

		while (console.hasNext()) {
			String sentence = console.nextLine();
			String dancePhrase = createPhrase(sentence.toLowerCase());
			System.out.println(dancePhrase);
		}

	}

	private static String createPhrase(String sentence) {
		StringBuilder danceSentence = new StringBuilder();
		int indexLetter = 1;

		for (int index = 0; index < sentence.length(); index++) {

			boolean isValidLetter = isLetter(sentence.charAt(index));

			if (isValidLetter && (indexLetter % 2 != 0)) {

				char upLetter = (char) (sentence.charAt(index) - 32);
				danceSentence.append(upLetter);

			} else {
				danceSentence.append(sentence.charAt(index));
			}

			if (isValidLetter) {
				indexLetter++;
			}

		}

		return danceSentence.toString();
	}

	private static boolean isLetter(char letter) {

		int letterValue = letter;

		if ((letterValue >= 97) && (letterValue <= 122)) {
			return true;
		}

		return false;
	}

}
