package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int [] valores = new int[10];
		
		
		for(int index=0;index< valores.length;index++) {
			valores[index] = Integer.valueOf(console.next());
		}
		
		for(int index=0;index< valores.length;index++) {
		
			if(valores[index]  <= 0) {
				valores[index] = 1;
			}
			
			System.out.println("X["+index+"] = "+valores[index]);
			
		}
		
		
		
		
		

	}

}
