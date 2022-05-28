package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();
		int min = Integer.MAX_VALUE,indexmin=0;
		
		int nCases = Integer.valueOf(console.next());
		
		for(int index=0;index < nCases;index++  ){
			
			int valor = Integer.valueOf(console.next());
			valores.add(valor);	
		}
		
		for(int index=0;index < nCases;index++  ){
			if(valores.get(index) < min ) {
				min = valores.get(index);
				indexmin = index;
			}	
		}
		
		System.out.println("Menor valor: "+min);
		System.out.println("Posicao: "+indexmin);

	}

}
