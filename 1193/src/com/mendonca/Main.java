package com.mendonca;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) throws IOException  {

		Scanner console = new Scanner(new File("c:\\file.txt"));
		
		//Scanner console = new Scanner(System.in);

		Map<String, Function<String, String>> functionsMap = new HashMap<String, Function<String, String>>();

		functionsMap.put("bin", (bim) -> {
			int decimal = Integer.parseInt(bim, 2);
			String hex = Integer.toHexString(decimal);
			String finalResult = decimal + " dec" + "\n" + hex + " hex";
			return finalResult;
		});

		functionsMap.put("dec", (dec) -> {
			String hex = Integer.toHexString(Integer.parseInt(dec)) + " hex";
			String binary = Integer.toString(Integer.parseInt(dec), 2) + " bin";
			String finalResult = hex + "\n" + binary;
			return finalResult;
		});

		functionsMap.put("hex", (hex) -> {
			String dec = Integer.parseInt(hex, 16)+" dec";
			String binary = Integer.toString(Integer.parseInt(hex, 16), 2)+" bin";		
			String finalResult = dec + "\n" + binary;
			return finalResult;
		});
		
		
		int nCases = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCases; index++) {

			String inputs = console.nextLine();

			String operation = inputs.split(" ")[1];
			String valueInput = inputs.split(" ")[0];

			String resut = functionsMap.get(operation).apply(valueInput);
			System.out.println("Case "+ (index+1)+":");
			System.out.println(resut);
			System.out.println();

		}

	}

}
