package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		while (true) {

			String input = console.nextLine();

			String valores[] = input.split("([ ])+");
			
			int valor1 = Integer.parseInt(valores[0]);
			int valor2 = Integer.parseInt(valores[1]);
			
			if( (valor1<=0) || (valor2<=0)  ) {
				break;
			}else {
				somaSequencia( valor1 ,valor2 );
			}
		}

	}

	public static void somaSequencia(int valor1, int valor2) {

		StringBuilder stringBuilder = new StringBuilder();

		int menor = valor1 < valor2 ? valor1 : valor2;
		int maior = valor1 > valor2 ? valor1 : valor2;
		int soma = 0;

		for (int index = menor; index <= maior; index++) {

			stringBuilder.append(index + " ");
			soma = soma + index;
		}
		stringBuilder.append("Sum=" + soma);
		System.out.println(stringBuilder.toString());
	}

}
