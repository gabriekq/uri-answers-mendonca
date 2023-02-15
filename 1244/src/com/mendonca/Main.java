package com.mendonca;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		
	    int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index< nCases;index++) {
			
			String text = console.nextLine();			
			String result = sortPrase(text);
			System.out.println(result);
		}
		console.close();

	}

	private static String sortPrase(String text) {
		
		String words[] = text.split(" ");
		Comparator<? super String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() >  o2.length()) {
					return -1;
				}
				
				if(o1.length() <  o2.length()) {
					return 1;
				}
				return 0;
			}
		};
		
	    String result =	Stream.of(words).sorted( comparator).map(w -> w+" "    ).collect(Collectors.joining());
		return result.trim();
	}

}
