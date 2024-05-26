package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		//Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		List<String> lines = new LinkedList<>();

		while (true) {

			String line = console.nextLine();

			if (line.equalsIgnoreCase("1")) {
				lines.clear();
			}
			
			if(line.length()==11) {
				lines.add(line);
			}
				
			if (line.equalsIgnoreCase("0")) {
				sortList(lines);
				lines.forEach(value -> System.out.println(value));
				System.out.println();
				
				lines.clear();	
			}
			
			if (line.equalsIgnoreCase("0") && (!console.hasNext())) {
				break;
			}
			
		}

	}

	private static void sortList(List<String> lines) {

         lines.sort((o1, o2) ->{
        	 int compareValue1 = Integer.parseInt(o1.split(" ")[1]);
        	 int compareValue2 = Integer.parseInt(o2.split(" ")[1]); 
        	 return Integer.compare(compareValue1, compareValue2);

         } );
	   }

}
