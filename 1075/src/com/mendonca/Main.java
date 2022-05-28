package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		long valor  = Long.parseLong(console.nextLine());
		
		for(long index=1; index != 10000; index++  ) {
			
			if(index  %  valor == 2 ) {
				System.out.println(index);
			}
		}
		
		

	}

}
