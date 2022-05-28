package com.mendonca.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		//https://www.urionlinejudge.com.br/judge/pt/runs/code/22731896
		int valor=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
	   try {
		  valor = Integer.valueOf(reader.readLine()); 
	  } catch (IOException e) {
		e.printStackTrace();
	  }
		
		
	for(int index=1;index <= valor;index++ ) {
		if(index % 2 != 0 ) {
			System.out.println(index);
		}
	}
	
	
	
	
		
	}

}
