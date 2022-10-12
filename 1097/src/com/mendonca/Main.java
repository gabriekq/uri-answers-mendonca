package com.mendonca;

public class Main {

	public static void main(String[] args) {
       //https://www.beecrowd.com.br/judge/pt/problems/view/1097
		printSequence();
	}

	private static void printSequence() {
		for (int indexI = 1, indexJ = 7; indexI != 11; indexI = indexI + 2, indexJ = indexJ + 2) {

			for (int index = indexJ; index > indexJ - 3; index--) {
				System.out.println("I=" + indexI + " J=" + index);

			}

		}

	}

}
