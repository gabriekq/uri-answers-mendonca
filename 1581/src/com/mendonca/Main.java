package com.mendonca;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner console = new Scanner(System.in);
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		HashSet<String> internacional = new HashSet<String>();

		int nCases = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCases; index++) {

			int nSubCases = Integer.parseInt(console.nextLine());

			for (int indexSub = 0; indexSub < nSubCases; indexSub++) {

				String nationality = console.nextLine();
				internacional.add(nationality);
			}

			if (internacional.parallelStream().count() == 1) {
				System.out.println(internacional.stream().findFirst().get());
			} else {
				System.out.println("ingles");
			}
			internacional.clear();

		}

	}

}
