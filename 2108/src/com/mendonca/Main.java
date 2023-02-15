package com.mendonca;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static String longestWord="";
	
	
	public static void main(String[] args) throws IOException {
		
		
		Scanner console = new Scanner(new File("c:\\file.txt"));
		//Scanner console = new Scanner(System.in);
		
		while(true) {
			
			String sentenceWord = console.nextLine();
			
			
			if(sentenceWord.equalsIgnoreCase("0")) {
				System.out.println();
				System.out.println("The biggest word: "+longestWord);
				break;
			}
						
		  String result =  evalueteSentence( new ArrayList<>(Arrays.asList(sentenceWord.split(" "))));
		  System.out.println(result);	

		}
		
	}

	private static String evalueteSentence(ArrayList<String> words) {
		
		StringBuilder result = new StringBuilder();
	
		
		for(int index=0; index <  words.size();index++) {
			
			int lenthSize = words.get(index).length();
			
			if(lenthSize >= longestWord.length() ) {
				longestWord = words.get(index);
			}
			
			result.append(lenthSize+"-");
				
		}
		
		return result.toString().substring(0, result.toString().length()-1);
	}

}
