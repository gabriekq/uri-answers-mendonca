package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	//https://www.beecrowd.com.br/judge/pt/problems/view/1168
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index < nCases;index++) {
			
		 String numero = console.nextLine(); 			
		 contaLeds(numero);
		 
		}
	}
	
	
   public static void contaLeds(String numero) {
			
	    int somaLeds =0; 
        Map<Character, Integer> leds = new HashMap<Character, Integer>();
        leds.put('1', 2);	
        leds.put('2', 5);	
        leds.put('3', 5);	
        leds.put('4', 4);	
        leds.put('5', 5);	
        leds.put('6', 6);	
        leds.put('7', 3);	
        leds.put('8', 7);	
        leds.put('9', 6);	
        leds.put('0', 6);	
					
            for(int index=0;index<numero.length();index++) {
        	    somaLeds = somaLeds + leds.get(numero.charAt(index));
            }
        
            System.out.println(somaLeds+" leds");
      }
}
