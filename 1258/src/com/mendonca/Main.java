package com.mendonca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		boolean done = false;
		
		ArrayList<String> peaple = new ArrayList<String>();
	
		Comparator<String> compartorColor = new Comparator<String>() {
			
			@Override
			public int compare(String name1, String name2) {
			
				if(name1.contains("branco")) {
					return -1 ;
				}
				
				if(name1.contains("vermelho")) {
					return 1 ;
				}
				
				return 0;
			}
		};
		
		
	Comparator<String> compartorSize = new Comparator<String>() {
			
			@Override
			public int compare(String name1, String name2) {
			
			 if(name1.contains("branco") && name2.contains("branco")  ) { 
				 
				return name2.substring(name2.indexOf("branco")+"branco".length(), "branco".length()+2 )
						.compareTo(name1.substring(name1.indexOf("branco")+"branco".length(), "branco".length()+2 ) );
				
			 }
			 
	      if(name1.contains("vermelho") && name2.contains("vermelho")  ) {  
				 
	    	  return name2.substring(name2.indexOf("vermelho")+"vermelho".length(), "vermelho".length()+2 )
	    			  .compareTo(name1.substring(name1.indexOf("vermelho")+"vermelho".length(), "vermelho".length()+2 ) );
				  
			 }
				
				return 0;
			}
		};
		
		Comparator<String> comparatorName = new Comparator<String>() {
			
			@Override
			public int compare(String name1, String name2) {
				
				if(name1.contains("branco") && name2.contains("branco")   ) {
					
					if(name1.split(" ")[1].equals("P") && name2.split(" ")[1].equals("P")  ) {
					   return	name1.substring(name1.indexOf("P")).compareTo(name2.substring(name2.indexOf("P")));
					}
					
					if(name1.split(" ")[1].equals("M") && name2.split(" ")[1].equals("M")  ) {
						   return name1.substring(name1.indexOf("M")).compareTo(name2.substring(name2.indexOf("M")));
					}
					
					if(name1.split(" ")[1].equals("G") && name2.split(" ")[1].equals("G")  ) {
						   return	name1.substring(name1.indexOf("G")).compareTo(name2.substring(name2.indexOf("G")));
					}
					
					
				}
				
		        if(name1.contains("vermelho") && name2.contains("vermelho")   ) {
					
					if(name1.split(" ")[1].equals("P") && name2.split(" ")[1].equals("P")  ) {
					   return	name1.substring(name1.indexOf("P")).compareTo(name2.substring(name2.indexOf("P")));
					}
					
					if(name1.split(" ")[1].equals("M") && name2.split(" ")[1].equals("M")  ) {
						   return name1.substring(name1.indexOf("M")).compareTo(name2.substring(name2.indexOf("M")));
					}
					
					if(name1.split(" ")[1].equals("G") && name2.split(" ")[1].equals("G")  ) {
						   return	name1.substring(name1.indexOf("G")).compareTo(name2.substring(name2.indexOf("G")));
					}
					
					
				}
				
				return 0;
			}
		};
		
		
	
		  
	   while(true) {
		   
		   int nCases = Integer.parseInt( console.nextLine());
		   
		   if(nCases==0) {
			   break;
		   }
		   
		   for(int index=0;index<nCases;index++) {
			   
			   String name = console.nextLine();
			   String tshirt = console.nextLine();
			   peaple.add(tshirt+" "+name);
			   
		   }
		   
		  if ( done == true) { // testar https://www.beecrowd.com.br/judge/pt/problems/view/1258
			 System.out.println();
		   }
		   
		  peaple.stream().sorted(compartorColor).sorted(compartorSize).sorted(comparatorName).forEach(value -> System.out.println(value)  );
		  peaple.clear();
		  done = true;
		  
		 
		  
		   
	   }
		
	 

	}
	

	   
}
