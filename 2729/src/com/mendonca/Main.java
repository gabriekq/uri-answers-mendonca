package com.mendonca;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
	
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index<nCases;index++) {
			
			String text = console.nextLine();
			System.out.println(	filterDuplicateWords(text));
		}
	}

	private static String filterDuplicateWords(String text) {
		
	      TreeSet<String> tree = new TreeSet<String>();
	      String words[] = text.split(" ");
		
	      Stream.of(words).forEach( w ->  tree.add(w) );
	      
	      String result =   tree.parallelStream().map( w -> w+" ").collect(Collectors.joining()).trim();
		
		return result;
	}

}
