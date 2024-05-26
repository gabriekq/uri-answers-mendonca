package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException  {

		TreeMap<String, Integer> species = new TreeMap<>();
		int  blanckSpaces = 0, totalInseted=0;

		//Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);

		String nCases = console.nextLine();

		for (int indexCases = 0; indexCases < Integer.parseInt(nCases); indexCases++) {

			while(console.hasNextLine()) {

				String input = console.nextLine();

				if (input.length() != 0) {
					totalInseted++;
					insetTree(input, species);
				} else {
					blanckSpaces = blanckSpaces + 1;
					if (blanckSpaces > 1) {
						break;
					}
				}

			}
			printTree(species,totalInseted);
			if(console.hasNextLine()) {
				System.out.println();
			}
            species.clear();
            totalInseted=0;
		}

	}

	private static void printTree(TreeMap<String, Integer> species,int totalInseted) {

		for (String key : species.keySet()) {

			double value =  ( (double) species.get(key) / (double) totalInseted) * 100;
			System.out.println(key+" "+String.format("%.4f", value));

		}	

	}

	private static void insetTree(String input, TreeMap<String, Integer> species) {

		if (species.containsKey(input)) {
			int value = species.get(input);
			value = value + 1;
			species.put(input, value);
		} else {
			species.put(input,  1);
		}

	}

}
