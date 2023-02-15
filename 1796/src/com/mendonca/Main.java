package com.mendonca;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		int value = Integer.parseInt(console.nextLine() );
		
		String population = console.nextLine();
		
		String populationVector[] = population.split(" ");
		
		long sumAgreed = Stream.of(populationVector).filter( elem -> elem.equals("0")    ).map( elem -> Long.parseLong(elem) ).count();
		
		String result =  (value/2) < sumAgreed ? "Y" : "N";
		
		System.out.println(result);
		

	}

}
