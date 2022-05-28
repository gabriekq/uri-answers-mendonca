package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1069 no uri enviar
		Scanner console = new Scanner(System.in);

		int nCases = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCases; index++) {

			String input = console.nextLine();
			int diamonts = countDiamont(input);
			System.out.println(diamonts);
		}

	}

	public static int countDiamont(String diamont) {

		int startInd = 0;
		int endInd = 0;
		int diamonts = 0;

		int exit = 0;

		StringBuilder sb = new StringBuilder(diamont);

		while (true) {

			int fistP = sb.indexOf("<", startInd);

			for (int index = fistP; index < sb.length(); index++) {

				if ((index == -1) || (endInd > sb.length())) {
					exit = 1;
					break;
				}

				if (sb.charAt(index) == '<') {
					fistP = index;
				} else {

					if (sb.charAt(index) == '>') {
						endInd = index;
					}

					if (endInd > fistP) {
						sb.delete(fistP, endInd);
						fistP--;
						diamonts++;
						break;
					}

				}

			}
			// System.out.println(sb.toString());
			if (exit == 1) {
				break;
			}

		}

		return diamonts;
	}

}
