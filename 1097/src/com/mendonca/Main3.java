package com.mendonca;

//https://www.beecrowd.com.br/judge/pt/problems/view/1098

public class Main3 {

	public static void main(String[] args) {

		printSequence();
	}

	private static void printSequence() {
		for (double indexI = 0, indexJ = 1; indexI < 2; indexI = indexI + 0.2) {

			for (double index = indexJ; index < 4; index++) {

				String result1 = String.format("%.1f", indexI);

				if (result1.substring(2).equals("0")) {
					System.out.println(
							"I=" + String.format("%.0f", indexI) + " J=" + String.format("%.0f", index + indexI));
				} else {
					System.out.println(
							"I=" + String.format("%.1f", indexI) + " J=" + String.format("%.1f", index + indexI));
				}

			}

		}

	}

}
