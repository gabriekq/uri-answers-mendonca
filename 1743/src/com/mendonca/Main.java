package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String input1 = console.nextLine();
		String input2 = console.nextLine();
		
        String inputs1[] = input1.split("([ ])+");	
        String inputs2[] = input2.split("([ ])+");
		
        System.out.println(isConpatible(inputs1,inputs2));
	}
	
	
	public static String isConpatible(String inputs1[],String inputs2[]) {
		
		for(int index=0;index< 5;index++) {
			
			if(inputs1[index].equalsIgnoreCase(inputs2[index])) {
				return "N";
			}	
		}
		return "Y";
	}
	
	

}
