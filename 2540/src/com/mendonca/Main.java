package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner console = new Scanner(System.in);
	//	 Scanner console = new Scanner(new File("c:\\file.txt"));
		
		while(console.hasNext()) {
			
			int valueTotal = Integer.parseInt(console.nextLine());
			
			String population = console.nextLine();
			
			String populationVector[] = population.split(" ");
			
			long sumAgreed = Stream.of(populationVector).filter( elem -> elem.equals("1")    ).map( elem -> Long.parseLong(elem) ).count();
			
			double veryfi = (double)   2/3;
			veryfi = veryfi * valueTotal;
			
			String result = sumAgreed >= veryfi  ?  "impeachment":"acusacao arquivada" ;
			
			System.out.println(result);
			
			
			// testar mais
			
		}
		
		
		
		
		
		
		

	}

}
