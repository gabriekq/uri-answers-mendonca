package com.mendonca;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args)  throws IOException  {
	
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner( System.in);
		ArrayList<String> resultText = new ArrayList<>(); 
		int maxLenth = 0;
		
		while(true) {
			
			String nCasesValue = console.nextLine();
			int nCases = Integer.parseInt(nCasesValue);
			
			if(nCases==0) {
				break;
			}
			
			for(int index=0;index<nCases;index++) {
				String lineText = console.nextLine();
				
				String textWithNoSpace = removeExtraSpace(lineText);
				resultText.add(textWithNoSpace);
				
			}
			
			maxLenth = resultText.parallelStream().map( line -> line.length()  ).max((o1, o2) -> o1.compareTo(o2)   ).get();
			justfifText(maxLenth,resultText);
			resultText.clear();
			if(console.hasNext() && !console.hasNext("0") ) {
				System.out.println();
			}
			
			
		}
		
	}


	private static void justfifText(int maxLenth, ArrayList<String> resultText) {
		StringBuilder spaces = new StringBuilder();
		
		
		for(int index=0;index<resultText.size(); index++  ) {
			
		int spacesToAdd = maxLenth - resultText.get(index).length();
		IntStream.iterate(1, x -> x + 1  ).limit(spacesToAdd).forEachOrdered( x -> spaces.append(" ")  );
		spaces.append(resultText.get(index));
		System.out.println(spaces.toString());
		spaces.setLength(0);
		}
			

	}



	private static String removeExtraSpace(String lineText) {
		
		String wordsText[] = lineText.split(" ");
	  
		
		StringBuilder finalSentence = new StringBuilder();
		
		for(String word : Stream.of(wordsText).filter( word -> word.length() !=0  ).collect(Collectors.toList())   ) {
			finalSentence.append(word+" ");
		}
		
		
		return finalSentence.toString().trim();
	}

}
