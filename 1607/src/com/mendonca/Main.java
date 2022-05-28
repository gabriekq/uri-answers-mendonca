package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int nCases =  Integer.parseInt(console.nextLine());
		
		for(int indexC=0;indexC < nCases; indexC++) {
        
		String value = console.nextLine();
		String input1 = value.split("([ ])+")[0];
		String input2 = value.split("([ ])+")[1];
		int opFinal =0;
		
		for (int index = 0; index < input1.length(); index++) {
		  int dif =  getDiff( input1.codePointAt(index)  ,  input2.codePointAt(index));
		  opFinal = opFinal + dif; 
		}
		System.out.println(opFinal);
	
		}

	}

	
	public static int getDiff(int source, int target) {
		int operations = 0;

		if (source == target) {
			return 0;
		}

		while (true) {

			if (source < target) {
				operations++;
				source++;
			} else {

				if (source < 122) {
					operations++;
					source++;
				} else {
					source = 96;
					operations++;
					source++;
				}
			}

			if (source == target) {
				break;
			}
		}

		return operations;
	}

}
