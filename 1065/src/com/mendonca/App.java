package com.mendonca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App{

	//https://www.urionlinejudge.com.br/judge/pt/problems/view/1065
	public static void main(String[] args) {
		
		 ArrayList<Integer> valores = new ArrayList<Integer>();	
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 int valoresPares=0;
		  
		 try {
		  for(int index=0; index < 5;index++) {	 
		     valores.add(Integer.valueOf(reader.readLine()));
		  }  
		 }catch(Exception e) {
			System.out.println(e.toString()); 
		 }

	      
		 for(int index=0;index < valores.size();index++ ){
			 
			 if(valores.get(index) %2 == 0  ) {
				valoresPares++; 
			 }
		 }
	
	     if(valoresPares > 0) {
	    	 System.out.println(valoresPares+" valores pares");
	     }
	
	
	}

}
