package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console =  new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int valorFibona = Integer.parseInt(console.nextLine());
		
		ArrayList<Integer> fibonacci =  new ArrayList<Integer>();
			
		for(int index=0;index<valorFibona;index++) {
			
			if(index <= 1) {
				fibonacci.add(index);	
			}else {
				fibonacci.add(  fibonacci.get(index-1)  +fibonacci.get(index-2));
			}
			sb.append(fibonacci.get(index)+" " );

		}
		System.out.println(sb.toString().trim());
		

	}

}
