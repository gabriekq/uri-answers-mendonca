package com.mendonca;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
					
		Scanner console = new Scanner(System.in);	

		String input  = console.nextLine();
		
		String valores[] = input.split(" ");
		
		String resultado = getMiddle(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]),Integer.parseInt(valores[2]));

	    System.out.println(resultado);

	}
	
	public static String getMiddle (int h,int z,int l) {
		
		 if ((z > h && h > l) || (z < h && h < l)) {
			 return "huguinho";
		 }
		 
		 if ((h > z && z > l) || (h < z && z < l)) {
			 return "zezinho";
		 }else {
			 return "luisinho";
		 }
	}
	
	
	

}
