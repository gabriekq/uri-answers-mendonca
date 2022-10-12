package com.mendonca;

public class Main2 {

	public static void main(String[] args) {

		printSequence();
	}

	private static void printSequence() {
		for (int indexI = 1, indexJ = 7; indexI != 11; indexI = indexI + 2) {

			for (int index = indexJ; index > indexJ-3; index--) {
				System.out.println("I=" + indexI + " J=" + index);

			}

		}

	}

}
