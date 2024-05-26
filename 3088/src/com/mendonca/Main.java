package com.mendonca;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

	//	Scanner console = new Scanner(System.in);
		
	   Scanner console = new Scanner(new File("c:\\file.txt"));
		
		// Presentation error (100%) but in udbug gets right

		while(console.hasNext()) {
			
		String input = console.nextLine();
		String outPut = evaluatePrase(input);
		System.out.println(outPut);	
		}
		


	}

	private static String evaluatePrase(String sentence) {

		int startFromIndex = 0, stopFronTextIndex = 0;
		StringBuilder stringBuilder = new StringBuilder();

		do {
			 int setenceLenth = sentence.length();

			int firstDot = sentence.substring(startFromIndex, setenceLenth).indexOf(".");
			int firstComa = sentence.substring(startFromIndex, setenceLenth).indexOf(",");

			sentence = sentence.substring(startFromIndex, setenceLenth);
			if (setenceLenth == 0) {
				continue;
			}

				stopFronTextIndex = calcStartFrom(firstDot, firstComa);

			if (stopFronTextIndex == 0) {
				stringBuilder.append(sentence);
				break;
			} else {
				String textFinal = changeText(sentence.substring(0, stopFronTextIndex + 1));
				stringBuilder.append(textFinal);
				startFromIndex = stopFronTextIndex + 1;
			}

		} while (sentence.length() != 0);

		return stringBuilder.toString();

	}

	private static String changeText(String substring) {

		if (substring.codePointBefore(substring.length() - 1) == ' ') {
			return substring.substring(0, substring.length() - 2) + substring.charAt(substring.length() - 1);
		}

		return substring;
	}

	private static int calcStartFrom(int firstDot, int firstComa) {

		if (firstDot == -1 && firstComa != -1) {
			return firstComa;
		}

		if (firstComa == -1 && firstDot != -1) {
			return firstDot;
		}

		if (firstDot < firstComa) {
			return firstDot;
		}

		if (firstComa < firstDot) {
			return firstComa;
		}

		return 0;
	}
	
		
	
	

}
