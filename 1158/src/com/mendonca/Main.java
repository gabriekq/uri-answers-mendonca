package com.mendonca;


import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt( console.nextLine());
		
		for(int index=0;index<nCases;index++) {
			
			String valuesInput =  console.nextLine();
			
			String values[] = valuesInput.split(" ");
			
			int resultValue = SumOddNum(Integer.parseInt(values[0]),  Integer.parseInt(values[1]));
            System.out.println(resultValue);
		}

	}

	private static int SumOddNum(int valuesStart, int countToSum) {
		
		int numberToStart = valuesStart % 2 == 0 ? valuesStart+1 :valuesStart;
		int sumofOdds = 0;
		
		for(int indexToSum=numberToStart , indexInteration = 0   ; indexInteration <  countToSum  ;indexToSum=indexToSum+2,indexInteration++) {
			sumofOdds = sumofOdds +indexToSum;
		}
		
		return sumofOdds;
	}
	
}
