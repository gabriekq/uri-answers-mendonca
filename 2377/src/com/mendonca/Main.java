package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    ///https://www.beecrowd.com.br/judge/pt/problems/view/2377
		
	  Scanner console = new Scanner(System.in);
	  String input = console.nextLine();	
	  String input2 = console.nextLine();	
		
	  
		
      int comprimentoEstrada = Integer.valueOf( input.split(" ")[0]) ;
      int disPedagios = Integer.valueOf( input.split(" ")[1]) ;
      
      int custKM =  Integer.valueOf( input2.split(" ")[0]);
      int valCadPed =Integer.valueOf( input2.split(" ")[1]);
      
      
      int valTottal = ((comprimentoEstrada/disPedagios)*valCadPed)+(comprimentoEstrada*custKM);
	
      System.out.println(valTottal);
		
		
		
		

	}

}
