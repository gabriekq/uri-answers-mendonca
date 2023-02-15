package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int nCases = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCases; index++) {

			int value = Integer.parseInt(console.nextLine());

			if (isPerfect(value)) {
				System.out.println(value + " eh perfeito");
			} else {
				System.out.println(value + " nao eh perfeito");
			}
		}

	}

	public static boolean isPerfect(int valueInput) {

		int sumValue = 0;
		ArrayList<Integer> divisibles = new ArrayList<Integer>();

		for (int index = 1; index < valueInput; index++) {

			if (valueInput % index == 0) {
				divisibles.add(index);
			}
		}

		int sumValues = divisibles.parallelStream().reduce((num1, num2) -> num1 + num2).orElse(0);
		return sumValues == valueInput;

	}

}
