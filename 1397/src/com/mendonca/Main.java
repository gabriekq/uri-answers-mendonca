package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		 Scanner console = new Scanner(System.in);
		//Scanner console = new Scanner(new File("c:\\file.txt"));
		Map<String, Integer> game = new HashMap<String, Integer>();

		while (true) {

			int nCases = Integer.parseInt(console.nextLine());

			if (nCases == 0) {
				break;
			}

			for (int index = 0; index < nCases; index++) {

				String value = console.nextLine();

				String values[] = value.split(" ");

				if (Integer.parseInt(values[0]) < Integer.parseInt(values[1]) ) {
					// L side
					game.put("L", game.getOrDefault("L", 0) + 1);
					continue;
				}
				
				if(Integer.parseInt(values[0]) > Integer.parseInt(values[1])) {
					game.put("R", game.getOrDefault("R", 0) + 1);
					continue;
				}
			}
			System.out.println(game.getOrDefault("R", 0)+" "+game.getOrDefault("L", 0));
			game.clear();
		}

	}

}
