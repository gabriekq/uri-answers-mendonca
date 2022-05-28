package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		do {
			
			int Ncases = Integer.valueOf(console.next());
			
			if(Ncases ==0) {
				break;
			}
			

			for(int index=0;index<Ncases;index++) {
				valores.add( Integer.valueOf(console.next()));
			}
			valores.sort(null);
			
			int soma = 0;
			for(int index=0;index < valores.size()-2; index++) {
		    	soma = soma +  valores.get(index+1)  - valores.get(index) ;
		    }
		
			System.out.println( soma);
			valores.clear();	
		}while(true);
		
		
		
		

	}

}
