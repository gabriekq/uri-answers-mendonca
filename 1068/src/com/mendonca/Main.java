package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.beecrowd.com.br/judge/pt/problems/view/1068

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		while (true) {
			
			
			if (console.hasNext()) {
                String expression = console.nextLine();
				boolean result = evaluateExpression(expression);

				if (result) {
					System.out.println("correct");
				} else {
					System.out.println("incorrect");
				}
			}else {
				break;
			}
		
		}

	}

	private static boolean evaluateExpression(String expression) {

		ArrayList<Character> parents = new ArrayList<Character>();

		for (int index = 0; index < expression.length(); index++) {

			char letter = expression.charAt(index);

			if (letter == '(') {
				parents.add(letter);
			}

			if (letter == ')') {

				if (parents.size() > 0) {
					parents.remove(parents.size() - 1);
				} else {
					return false;
				}

			}

		}

		return parents.size() == 0 ? true : false;
	}

}
