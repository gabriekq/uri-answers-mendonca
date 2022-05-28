package com.mendonca;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String []valoresLine = console.nextLine().split("([ ])+");
		
		for(int index=0;index<valoresLine.length;index++) {
			
			if(valoresLine[index].equalsIgnoreCase("1")) {
				System.out.println(index+1);
				break;
			}
		}
		
		
		

	}

}
