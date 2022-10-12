package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
	
		int zValue = Integer.parseInt(console.nextLine() );
			
		while(true) {
			
			int value = Integer.parseInt(console.nextLine());
			
			if(value > zValue ) {
				int result = evalueteZValueResult(value, zValue);
				System.out.println(result);
				break;
			}
			
		}
		

	}

	private static int evalueteZValueResult(int value, int zValue) {
	
		int sum= 0;
		
		int index;
		for(index=1; ;index++  ) {
			sum = sum + zValue;
			zValue = zValue +1;
			
			if(sum >value ) {
				return index;
			}
			
			
		}
		
		
		
	}

}
