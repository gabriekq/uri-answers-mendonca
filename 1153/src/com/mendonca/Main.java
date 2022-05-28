package com.mendonca;

import java.util.Scanner;
import java.util.stream.LongStream;


public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in );
		
		long valor = Long.parseLong( console.nextLine());
		
		
	    long fatorial =	LongStream.rangeClosed(1, valor).reduce( 1,(x,y) -> x*y  );		
		System.out.println(fatorial);
		

	}

}
