package com.mendonca;

import java.util.Arrays;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		while (true) {

			String valor = console.nextLine();

			if (valor.equalsIgnoreCase("0 0")) {
				break;
			}

			String linha2 = console.nextLine();
			String valores[] = linha2.split("([ ])+");

			 Map<String, Long> valoresDistintos = Arrays.stream(valores).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
			 valoresDistintos.entrySet().removeIf( e -> e.getValue() ==1 );

			System.out.println(valoresDistintos.size());

		}

	}

}
