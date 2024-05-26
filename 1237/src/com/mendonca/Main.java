package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

		// Scanner console = new Scanner(System.in);
		Scanner console = new Scanner(new File("c:\\file.txt"));

		while (console.hasNext()) {
			String value1 = console.nextLine();

			String value2 = console.nextLine();
			int maxSubsText = calculateMaxSubText(value1, value2);
			System.out.println(maxSubsText);
		}

	}

	private static int calculateMaxSubText(String source, String target) {

		int index = 0, indexEnd = 0;
		int minSubSize = 0;

		do {

			if (indexEnd < source.length()) {
				indexEnd++;
			}

			String subSource = source.substring(index, indexEnd);
			if (target.contains(subSource)) {

				if (minSubSize < subSource.length()) {
					minSubSize = subSource.length();
				}

			} else {
				index++;
			}

		} while (indexEnd < (source.length()));

		return minSubSize;
	}

}
