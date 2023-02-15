package com.mendonca;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException{

	   Scanner console = new Scanner(new File("c:\\file.txt"));
		
		//Scanner console = new Scanner(System.in);

		while (console.hasNext()) {

			String inputLetters = console.nextLine();

			if(!inputLetters.isEmpty()) {
			 rangeLetters(inputLetters.replaceAll(" ", ""));
			}
			
			System.out.println();

		}

	}

	private static void rangeLetters(String lettes) {
		List<Integer> lettersValue = Stream.of(lettes.split("")).distinct().sorted()
				.map(letter -> letter.codePointAt(0)).collect(Collectors.toList());
		StringBuilder result = new StringBuilder();

		int currentIndex = 0;

		while (true) {

			result.append(Character.toString(lettersValue.get(currentIndex)) + ":");

			currentIndex = rangeIndex(lettersValue, currentIndex);
			result.append(Character.toString(lettersValue.get(currentIndex)));

			if (currentIndex == (lettersValue.size() - 1)) {
				System.out.print(result.toString());
				result.setLength(0);
				break;
			} else {
				System.out.print(result.toString() + ", ");
				result.setLength(0);
			}

			currentIndex++;

		}

	}

	private static int rangeIndex(List<Integer> lettersValue, int currentIndex) {

		int indexReturn = 0;

		if (currentIndex == (lettersValue.size() - 1)) {
			return currentIndex;
		}

		for (int index = currentIndex; index < lettersValue.size() - 1; index++) {

			if (lettersValue.get(index) + 1 == lettersValue.get(index + 1)) {
				indexReturn = index + 1;
			} else {
				return index;
			}

		}

		return indexReturn;
	}

}
