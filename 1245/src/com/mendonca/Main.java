package com.mendonca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, ArrayList<String>> boots = new HashMap<Integer, ArrayList<String>>();
		Scanner console = new Scanner(System.in);
		
		while(console.hasNext()) {
		
		   int nCases = Integer.parseInt( console.nextLine());
			
			for(int index=0;index< nCases;index++) {
				
				String input = console.nextLine();
				
				String values[] = input.split(" ");
				
				 manageBoot( Integer.parseInt(values[0]), values[1] ,boots   );
			}
			long peers = countPears(boots);
			System.out.println(peers);
			boots.clear();
			
			
		}
       	
	}

	public static long countPears(Map<Integer, ArrayList<String>> boots) {
		long countPeers = 0;
	
		for(Integer key : boots.keySet()  ) {
			
		    ArrayList<String> sides =  	boots.get(key);
			
		    long countD = sides.parallelStream().filter( value -> value.equals("D")).count();
		    long countE = sides.parallelStream().filter( value -> value.equals("E")).count();
			
		    if(countD == countE) {
		    	countPeers = countPeers +countD;
		    }else {
		    	
		    	long min = countD < countE ? countD  : countE;
		    	countPeers = countPeers +  min;
		    	
		    	
		    }
		    
			
		}

		return countPeers;
	}

	private static void manageBoot(int key, String letterValue , Map<Integer, ArrayList<String>> boots) {
		
		if(boots.containsKey(key)) {
			boots.get(key).add(letterValue);
		}else {
			
			ArrayList<String> letters = new ArrayList<String>();
			letters.add(letterValue);		
			boots.put(key, letters);
		}

	
	}

}
