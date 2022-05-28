package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();
		int par=0,impar=0,positivo=0,negativo=0;
		
		
		valores.add( Integer.valueOf(console.next()));
		valores.add( Integer.valueOf(console.next()));
		valores.add( Integer.valueOf(console.next()));
		valores.add( Integer.valueOf(console.next()));
		valores.add( Integer.valueOf(console.next()));
		
		for(int index=0;index< valores.size();index++ ) {
			
			      if(valores.get(index) % 2 == 0  ) {
				      par++;
				      
			         }else {
				        impar++;
			           }
			
			      if(valores.get(index) > 0  ) {
				       positivo++;
			      }
			
			      if(valores.get(index) < 0  ) {
			    	  negativo ++;
			      }	
		    }
		
		System.out.println(par+" valor(es) par(es)");
		System.out.println(impar+" valor(es) impar(es)");
		System.out.println(positivo+" valor(es) positivo(s)");
		System.out.println(negativo+" valor(es) negativo(s)");
		
		

	}

}
