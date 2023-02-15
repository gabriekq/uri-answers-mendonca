package com.medonca;


import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
    	Scanner console = new Scanner(System.in);
		
		//Scanner console = new Scanner(new File("c:\\file.txt"));
		
		while(console.hasNext()) {
			
		   String value =  console.nextLine();
			
			int resultValue = Integer.parseInt(value) - 1;
			
			System.out.println(resultValue);
			
			
		}
		
		
	}

}
