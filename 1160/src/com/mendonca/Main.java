package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int nCases = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCases; index++) {

			String valuesInput = console.nextLine();

			String valoes[] = valuesInput.split(" ");

			int years = populationGrow(Integer.parseInt(valoes[0]), Integer.parseInt(valoes[1]),
					Double.parseDouble(valoes[2]), Double.parseDouble(valoes[3]));

			if (years == -1) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.println(years + " anos.");
			}

		}

	}

	public static int populationGrow(int populationA, int populationB, double rateA, double rateB) {

		for (int index = 1; true; index++) {

			int percentOfPeapleA = (int) (populationA * (rateA / 100));
			int percentOfPeapleB = (int) (populationB * (rateB / 100));

			populationA = populationA + percentOfPeapleA;
			populationB = populationB + percentOfPeapleB;

			if (index > 100) {
				return -1;
			}

			if (populationA > populationB) {
				return index;
			}

		}

	}

}
