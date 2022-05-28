package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		String input = console.nextLine();

		String valores[] = input.split(" ");

		int bloco = Integer.parseInt(valores[0]);
		int valorFinal = Integer.parseInt(valores[1]);

		for (int index = 1;; index++) {

			numeros.add(index);

			if (numeros.size() == bloco) {
				printBloco(numeros,bloco );
				numeros.clear();
			}

			if (index == valorFinal) {
				printBloco(numeros,bloco);
				numeros.clear();
				break;
			}

		}
	}

	private static void printBloco(ArrayList<Integer> numeros,int bloco) {

		StringBuilder saida = new StringBuilder();
		for (int index = 0; index < numeros.size(); index++) {
			saida.append(numeros.get(index) + " ");
		}

		if(numeros.size()==bloco) {
		  System.out.println(saida.toString().trim());	
		}else {
			  System.out.print(saida.toString());	
		}

		saida.setLength(0);
	}

}
