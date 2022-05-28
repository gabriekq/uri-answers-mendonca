package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner console = new Scanner(System.in);
		
		String []valoresLine = console.nextLine().split("([ ])+");
		StringBuilder palavra = new StringBuilder();
		StringBuilder frase = new StringBuilder();
		
		for(int index=0;index<valoresLine.length;index++) {
			
			for(int index2=0;index2 < valoresLine[index].length();index2++  ) {
			
				if(index2 % 2 != 0) {
					palavra.append(valoresLine[index].charAt(index2));
				}
			}
			frase.append(palavra.toString()+" ");
			palavra.setLength(0);
		}
		System.out.println(frase.toString().trim());
	}

}
