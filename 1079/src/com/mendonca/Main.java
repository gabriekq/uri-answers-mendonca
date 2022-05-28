package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int nCase = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCase; index++) {

			String input = console.nextLine();
			String valores[] = input.split(" ");

			String mediaPonderada = mediaPonderada(Double.parseDouble(valores[0]), Double.parseDouble(valores[1]),
					Double.parseDouble(valores[2]));
			System.out.println(mediaPonderada);
		}
	}

	private static String mediaPonderada(double valor1, double valor2, double valor3) {

		double mediaPonderada = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / (5 + 3 + 2);
		return String.format("%.1f", mediaPonderada);
	}

}
