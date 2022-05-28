package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=1; index < nCases+1; index++) {
			
		 int primeiro = index;
		 int segundo = (int) Math.pow(index, 2);
		 int terceiro = (int) Math.pow(index, 3);
			
		 System.out.println(primeiro+" "+segundo+" "+terceiro);
		 System.out.println(primeiro+" "+(segundo+1)+" "+(terceiro+1));
		}
	}

}
