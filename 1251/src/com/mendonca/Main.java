package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner console =  new Scanner(System.in);  //new Scanner(new File("c:\\file.txt"));

		TreeMap<Integer, Integer> frequency = new TreeMap<Integer, Integer>();

		Comparator<? super Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {

				return (o1.getValue()).compareTo(o2.getValue());
			}
		};

		Comparator<? super Entry<Integer, Integer>> comparatorKey = new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {

				if ((o1.getKey() > o2.getKey()) && (o1.getValue() == o2.getValue())) {
					return -1;
				}

				if ((o1.getKey() < o2.getKey()) && (o1.getValue() == o2.getValue())) {
					return 1;
				}

				return 0;

			}
		};

		while (console.hasNext()) {

			String value = console.nextLine();

			for (int index = 0; index < value.length(); index++) {

				insertTree(value.charAt(index), frequency);

			}

			frequency.entrySet().stream().sorted(comparator).sorted(comparatorKey)
					.forEach((elem) -> System.out.println(elem.getKey() + " " + elem.getValue()));

			frequency.clear();

			if (console.hasNext()) {
				System.out.println();
			}

		}

	}

	public static void insertTree(char key, TreeMap<Integer, Integer> frequency) {

		int keyInt = (int) key;

		if (frequency.containsKey(keyInt)) {

			int newCount = frequency.get(keyInt) + 1;
			frequency.put(keyInt, newCount);

		} else {

			frequency.put(keyInt, 1);

		}

	}

}
