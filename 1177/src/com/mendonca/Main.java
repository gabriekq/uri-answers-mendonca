package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int vetor[] = new int[1000];
		int contadorControle = 0;

		int valor = Integer.parseInt(console.nextLine());

		for (int index = 0; index < 1000; index++) {
			vetor[index] = contadorControle;
			if (contadorControle == (valor - 1)) {
				contadorControle = -1;
			}
			contadorControle++;
		}

		for (int index = 0; index < 1000; index++) {
			System.out.println("N[" + index + "] = " + vetor[index]);
		}

	}

}
