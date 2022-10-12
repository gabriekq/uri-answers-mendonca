package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.IOException;

public class Main {

	public static void main(String[] args)  throws IOException {
		
		
		int values[] = new int[20];
		Scanner console = new Scanner(System.in);
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		
		for(int index=0; index < values.length;index++ ) {
			
			int value = Integer.parseInt(console.nextLine());		
			values[index] = value;			
		}
		
		
		for(int indexMain=0, indexSecond=19;indexMain<10;  indexMain++ , indexSecond--    ) {
			
			int valueMain = values[indexMain];
			
			int valueSecond = values[indexSecond];
			
			values[indexMain] = valueSecond;
			
			values[indexSecond] = valueMain;

		}
		
		
		for(int index=0;index<values.length;index++) {
			System.out.println("N["+index+"] = "+values[index]);
		}
		
		

	}

}
