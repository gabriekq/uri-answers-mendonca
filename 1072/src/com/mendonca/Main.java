package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt( console.nextLine() );
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		for(int index=0;index<nCases;index++) {
			
			int valor = Integer.parseInt( console.nextLine() );
			valores.add(valor);			
		}
		
		long noIntervalo = valores.parallelStream().filter( v ->  (v >= 10) &&  (v <= 20)   ).count();
		long foraIntervalo = valores.parallelStream().filter( v ->  (v < 10) ||  (v > 20)   ).count();
		
		System.out.println(noIntervalo+" in");
		System.out.println(foraIntervalo+" out");

	}

}
