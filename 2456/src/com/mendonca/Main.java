package com.mendonca;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args)  throws IOException {

		//Scanner console = new Scanner(new File("c:\\file.txt"));
		
		Scanner console = new Scanner(System.in);
		
		String input = console.nextLine();
		
		List<Integer> values = Collections.list(new StringTokenizer(input, " ")).stream().map(token -> Integer.valueOf(token.toString())).collect(Collectors.toList());
				
		String outPut = isAscSequence(values)==true ? "C" : isDescSequence(values) == true ? "D" : "N";
		System.out.println(outPut);
		

	}

	private static boolean isAscSequence(List<Integer> values) {
				
		for(int index=0;index<values.size()-1; index++ ) {
			
			if(!(values.get(index) < values.get(index+1)) ) {
				return false;
			}				
		}

		return true;
	}


	private static boolean isDescSequence(List<Integer> values) {
		
		for(int index=0;index<values.size()-1; index++ ) {
			
			if(!(values.get(index) > values.get(index+1)) ) {
				return false;
			}				
		}

		return true;
	}

}
