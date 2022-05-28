package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		while (true) {

			String input = console.nextLine();

			if (input.equalsIgnoreCase("2002")) {
				System.out.println("Acesso Permitido");
				break;
			} else {
				System.out.println("Senha Invalida");

			}

		}

	}

}