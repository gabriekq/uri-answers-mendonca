package com.mendonca;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws  IOException  {
		
		Scanner console = new Scanner(System.in); //new Scanner(new File("c:\\file.txt"));
		
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int index=0;index<nCases;index++) {
			
			String paramsVector = console.nextLine();	
			String values =  console.nextLine();
			
			String params[] = paramsVector.split(" ");	
			String valuesList[] = values.split(" ");
			
			ArrayList<String> valuesHash[] = new  ArrayList[Integer.parseInt(params[0])];
			
			insertHashTable(valuesHash,valuesList,Integer.parseInt(params[0]));
			listElements(valuesHash);
			
			if(index != nCases-1) {
			System.out.println();	
			}
			
			
			
		}
		
		

	}

	public static void listElements(ArrayList[] valuesHash) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		
		for(int index=0;index<valuesHash.length;index++) {
			
			if(valuesHash[index]==null) {
				System.out.println(index+" -> \\");
			}else {
			
				ArrayList values = valuesHash[index];
			
				stringBuilder.append(index);
				values.forEach( num ->  stringBuilder.append(" -> "+num));
				stringBuilder.append(" -> \\");
				System.out.println(stringBuilder.toString());
				stringBuilder.setLength(0);
				
			}
			
		}
		
	}

	public static void insertHashTable(ArrayList[] valuesHash, String[] valuesList, int key) {
		
		for(int index=0; index < valuesList.length;index++) {
			
			 int value =   Integer.parseInt(valuesList[index]);
			 
			 int indexToApply =  value % key;
			
             insertHashValue(value,indexToApply,valuesHash);
		}
		
	}

	public static void insertHashValue(int value, int indexToApply, ArrayList[] valuesHash) {	
		
		if(valuesHash[indexToApply] == null ) {
			ArrayList<Integer> values = new ArrayList<Integer>();
			values.add(value);
			valuesHash[indexToApply]  = values;
		}else {
			valuesHash[indexToApply].add(value);
		}
		
	}



}
