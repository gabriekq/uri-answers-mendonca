package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();
		

		valores.add( Integer.valueOf(console.next()));
		valores.add( Integer.valueOf(console.next()));
		valores.add( Integer.valueOf(console.next()));
		
		valores.sort(null);
		
		System.out.println(valores.get(valores.size() -1  )+" eh o maior");
		

	}

}
