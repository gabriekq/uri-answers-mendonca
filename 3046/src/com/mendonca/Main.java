package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		
		String value = console.next();
		int number = Integer.parseInt(value);
		
		int result = ((number+1)*(number+2))/2;
		System.out.println(result);
		
		
		

	}

}
