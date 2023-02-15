package com.mendonca;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		
		
		Map<String, Integer> passUpper = new HashMap<>();
		Map<String, Integer> passLower = new HashMap<>();
		
		passUpper.put("GQ", 0);
		passUpper.put("IS", 1);
		passUpper.put("EOY", 2);
		passUpper.put("FPZ", 3);
		passUpper.put("JT", 4);
		passUpper.put("DNX", 5);
		passUpper.put("AKU", 6);
		passUpper.put("CMW", 7);
		passUpper.put("BLV", 8);
		passUpper.put("HR", 9);
		
		passLower.put("aku", 0);
		passLower.put("blv", 1);
		passLower.put("cmw", 2);
		passLower.put("dnx", 3);
		passLower.put("eoy", 4);
		passLower.put("fpz", 5);
		passLower.put("gq", 6);
		passLower.put("hr", 7);
		passLower.put("is", 8);
		passLower.put("jt", 9);
		
		String nCases = console.nextLine();
		int cases = Integer.parseInt(nCases);
		
		for(int index=0;index < cases;index++ ) {
			
			String textInput = console.nextLine();
			
			String textNoSpace = textInput.replaceAll(" ", "");
			String result = generateRA(textNoSpace,passLower,passUpper);
			System.out.println(result);
		}
		
		
		
		
	}

	private static String generateRA(String textInput, Map<String, Integer> passLower, Map<String, Integer> passUpper) {
		StringBuilder result = new StringBuilder();
		
		for(int index=0;index<textInput.length();index++) {
		
			if(index==12) {
				break;
			}
			
			String letter = String.valueOf(textInput.charAt(index));
			
			if(Character.isLowerCase(letter.codePointAt(0)) ) {
			String key = passLower.keySet().parallelStream().filter( keySearch -> keySearch.contains(letter)   ).findFirst().get();	
			result.append(passLower.get(key));	
			}else {
				String key = passUpper.keySet().parallelStream().filter( keySearch -> keySearch.contains(letter)   ).findFirst().get();	
				result.append(passUpper.get(key));	
			}
		}
		
		return result.toString();
	}

}
