package com.mendonca;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {

	  Scanner console = new Scanner(new File("c:\\file.txt")); // works but uri does not aceepted
	//	Scanner console = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<>();

		int nCases = Integer.parseInt(console.nextLine());

		for (int indexCases = 0; indexCases < nCases; indexCases++) { // cases

			int nNumbers = console.nextInt();

			for (int indexNumbers = 0; indexNumbers < nNumbers; indexNumbers++) {

				int number = Integer.parseInt(console.next());

				if (values.size() < 6) {
					values.add(number);
					values.sort((num1, num2) -> num1.compareTo(num2));
				} else {

					int indexToStart = manageAddArray(0, values.size() - 1, values, number);

					addValueToArray(values, indexToStart, number);

				}

			}
			System.out.println(values.toString().replace(",", "").replace("[", "").replace("]", ""));
			values.clear();
		}

	}

	private static void addValueToArray(ArrayList<Integer> values, int indexToStart, int number) {

		if (number <= values.get(0)) {
			values.add(0, number);
			return;
		}

		if (number >= values.get(values.size() - 1)) {
			values.add(number);
			return;
		}

		if (indexToStart == 0) {
			indexToStart = indexToStart + 1;
		}

		for (int index = indexToStart; index < values.size(); index++) {

			if (number == values.get(index + 0)) {
				values.add(index, number);
				return;
			}

			if ((values.get(index - 1) < number) && (number < values.get(index))) {
				values.add(index, number);
				return;
			}
		}
		System.out.println("not added" + number);

	}

	private static int manageAddArray(int indexStart, int indexEnd, ArrayList<Integer> values, int numberToAdd) {

		while (true) {

			int middleIndex = (indexStart + indexEnd) / 2;

			if (numberToAdd > values.get(middleIndex)) {

				indexStart = middleIndex;

			} else {
				indexEnd = middleIndex;
			}

			int maxValue = indexEnd > indexStart ? indexEnd : indexStart;
			int minValue = indexStart < indexEnd ? indexStart : indexEnd;
			int diffIndex = maxValue - minValue;

			if (diffIndex < 2) { 
				return indexStart;
			}
		}
	}

}
