package com.mendonca;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>();
		Scanner console = new Scanner(System.in);

		for (int indexP = 0;; indexP++) {

			int nCases = Integer.parseInt(console.nextLine());

			if (nCases == 0) {
				break;
			} else {
				if (indexP != 0) {
					System.out.println();
				}

				for (int index = 0; index < nCases; index++) {
					String input = console.nextLine();
					nomes.add(input);
				}
				System.out.print(criarJustificacao(nomes));
				nomes.clear();
			}

		}

	}

	private static String criarJustificacao(ArrayList<String> nomes) {
		int maxLenth = nomes.stream().mapToInt(v -> v.length()).max().orElse(0);
		StringBuilder saida = new StringBuilder();
		int diffName = 0;

		for (String nome : nomes) {

			diffName = maxLenth - nome.length();
			saida.append(createSpace(diffName) + nome + "\n");
		}
		return saida.toString();
	}

	private static String createSpace(int num) {
		StringBuilder spaces = new StringBuilder();
		for (int index = 0; index < num; index++) {
			spaces.append(" ");
		}
		return spaces.toString();
	}

}
