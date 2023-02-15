package com.mendonca;


import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner console = new Scanner(System.in);

		while (console.hasNext()) {

			String text = console.nextLine();

			String result = feachText(text);
			System.out.println(result);
		}

	}

	private static String feachText(String text) {

		StringBuilder result = new StringBuilder();
		boolean opendI = true;
		boolean opendB = true;

		for (int index = 0; index < text.length(); index++) {

			if ((text.charAt(index) != '*') && (text.charAt(index) != '_')) {
				result.append(text.charAt(index));
			} else {

				if ((text.charAt(index) == '_') && (opendI == true)) {
					result.append("<i>");
					opendI = false;

				} else {

					if ((text.charAt(index) == '_') && (opendI == false)) {
						result.append("</i>");
						opendI = true;
					}

				}

				// order letter
				if ((text.charAt(index) == '*') && (opendB == true)) {
					result.append("<b>");
					opendB = false;

				} else {

					if ((text.charAt(index) == '*') && (opendB == false)) {
						result.append("</b>");
						opendB = true;

					}

				}

			}

		} // for

		return result.toString();
	}

}
