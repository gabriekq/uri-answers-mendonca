package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		StringBuilder saida = new StringBuilder();
		int valorSaida = 1;

		int nLinhas = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nLinhas; index++) {

			for (int index2 = 0; index2 < 3; index2++) {

				saida.append(valorSaida + " ");
				valorSaida++;

				if (valorSaida % 4 == 0) {
					valorSaida++;
				}

			}
			saida.append("PUM");
			System.out.println(saida.toString());
			saida.setLength(0);

		}

	}

}
