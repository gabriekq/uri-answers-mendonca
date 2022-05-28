package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		valores.add(Integer.parseInt(console.next()));
		
		valores.add(Integer.parseInt(console.next()));
		valores.sort(null);
		
		
		if(valores.get(1) % valores.get(0) == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		
		

	}

}
