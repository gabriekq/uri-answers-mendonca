package com.mendonca;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index< nCases;index++ ) {
			
			String input =  console.nextLine();
			
			String []inputs = input.split("([ ])+");
			String output =  combinator(inputs[0],inputs[1]);
			System.out.println(output);	
		}
	}
	
	
	public static String combinator(String first, String second) {
		
		StringBuilder stringBuilder = new StringBuilder();
		int count =0 ;
		
		while(true) {
			
			if(first.length() > count) {
			  stringBuilder.append(first.charAt(count));
			}
			
			if(second.length()  >  count ) {
				 stringBuilder.append(second.charAt(count));
			}
			
			if( (first.length() < count)   && (second.length()  < count)  ) {
				break;
			}
			count++;
		}
		return stringBuilder.toString();
	}
	
	

}
