package com.mendonca;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException{

		//Scanner console = new Scanner(new File("c:\\file.txt")); approved
		Scanner console = new Scanner(System.in);
		Map<Integer, String> scores = new HashMap<>();
		scores.put(0, "A");
		scores.put(1, "B");
		scores.put(2, "C");
		scores.put(3, "D");
		scores.put(4, "E");

		while (true) {

			int nCases = Integer.parseInt(console.nextLine());

			if (nCases == 0) {
				break;
			}

			for (int index = 0; index < nCases; index++) {

				String valueInput = console.nextLine();

				String values[] = valueInput.split(" ");

				if (Stream.of(values).map(numTxt -> Integer.parseInt(numTxt)).filter(number -> number <= 127).count() == 1) {
					
					int minValue = Stream.of(values).map(numTxt -> Integer.parseInt(numTxt))
							.min((o1, o2) -> o1.compareTo(o2)).get();

					String result = evalueteScore(minValue, values, scores);
					System.out.println(result);

				} else {
					System.out.println("*");
				}

			}

		}

	}

	private static String evalueteScore(int minValue, String[] values, Map<Integer, String> scores) {
		int currentIndex = 0;

		for (int index = 0; index < values.length; index++) {

			if (Integer.parseInt(values[index]) == minValue) {
				currentIndex = index;
				break;
			}

		}

		return scores.get(currentIndex);
	}

}
