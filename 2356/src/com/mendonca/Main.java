package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		while (true) {

			if (console.hasNext()) {

				String dna = console.nextLine();

				String sequencia = console.nextLine();

				if (dna.contains(sequencia)) {
					System.out.println("Resistente");
				} else {
					System.out.println("Nao resistente");
				}

			} else {
				break;
			}
		}

	}

}
