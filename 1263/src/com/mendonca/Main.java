package com.mendonca;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args)  throws IOException { // testar

		Scanner console = new Scanner(System.in);

		//Scanner console = new Scanner(new File("c:\\file.txt"));

		while (console.hasNext()) {

			String phrase = console.nextLine();
			phrase = phrase.toLowerCase();

			ArrayList<String> wordsVetor = new ArrayList<String>(List.of(phrase.split(" ")));

			long numbersAlliteration = resolveAlliteration(wordsVetor);
			System.out.println(numbersAlliteration);

		}

	}

	

	private static long resolveAlliteration(ArrayList<String> wordsVetor) {

		int indexToRemove = 0;
		long sumSub = 0, sumFinal = 0;

		while (wordsVetor.size() != 0) {

			for (int index = 0; index < wordsVetor.size() - 1; index++) {

				if (wordsVetor.get(index).charAt(0) == wordsVetor.get(index + 1).charAt(0)) {
					sumSub++;
				} else {
					indexToRemove = index + 1;
					break;
				}

			}

			wordsVetor = new ArrayList<String>(wordsVetor.stream().skip(indexToRemove).collect(Collectors.toList()));
			if (sumSub > 0) {
				sumFinal++;
				sumSub = 0;
			}
			indexToRemove = wordsVetor.size();
		}

		return sumFinal;
	}

}
