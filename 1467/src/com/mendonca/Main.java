package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		Map<String, String> codigos = new HashMap<String, String>();

		codigos.put("0 1 1", "A");
		codigos.put("1 0 1", "B");
		codigos.put("1 1 0", "C");

		codigos.put("1 0 0", "A");
		codigos.put("0 1 0", "B");
		codigos.put("0 0 1", "C");

		codigos.put("0 0 0", "*");
		codigos.put("1 1 1", "*");

		while (true) {

			if (!console.hasNext()) {
				break;
			} else {
				String input = console.nextLine();
				System.out.println(codigos.get(input));

			}

		}

	}

}
