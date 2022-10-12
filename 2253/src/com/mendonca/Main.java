package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		 Scanner console = new Scanner(System.in);

//		Scanner console = new Scanner(new File("c:\\file.txt"));

		while (console.hasNext()) {

			String input = console.nextLine();

			boolean validPass = validatePass(input);
			if(validPass) {
				System.out.println("Senha valida.");
			}else {
				System.out.println("Senha invalida.");
			}

		}

	}

	private static boolean validatePass(String input) {

		boolean validLenth = validateLenth(input);
		if (!validLenth) {
			return false;
		}

		boolean validSpacialLetters = validSpacialLetterSpace(input);
		if(!validSpacialLetters) {
			return false;
		}
		
		boolean validLetter = validLeastUpLower(input);
		if(!validLetter) {
			return false;
		}
		
		return true;
	}

	
	
	private static boolean validSpacialLetterSpace(String input) {
	
		String regex ="[^A-Za-z0-9]+";
		Matcher matcher = Pattern.compile(regex).matcher(input);
		return  !matcher.find()  ;
	}

	// validate the first set of conditions letters and numbers
	private static boolean validLeastUpLower(String input) {
			
	 boolean leastLowerLetter= Stream.of(input.split(""))
			                   .parallel()
			                   .map( letter ->   (int) letter.charAt(0)    )
			                   .filter( interval -> (interval  >= 97)  && (interval  <= 122))
			                   .findAny()
			                   .isPresent();
	if(!leastLowerLetter) {
		return false;
	}	
	 
	 boolean leastUPLetter= Stream.of(input.split(""))
             .parallel()
             .map( letter ->   (int) letter.charAt(0)    )
             .filter( interval -> (interval  >= 65)  && (interval  <= 90))
             .findAny()
             .isPresent();
	 
	 if(!leastUPLetter) {
		 return false;
	 }
	 
	boolean leastNumber= Stream.of(input.split(""))
             .parallel()
             .map( letter ->   (int) letter.charAt(0)    )
             .filter( interval -> (interval  >= 48)  && (interval  <= 57))
             .findAny()
             .isPresent();
	
	 if(!leastNumber) {
		 return false;
	 }
	 
	    	return true;
	}

	private static boolean validateLenth(String input) {

		if ((input.length() >= 6) && (input.length() <= 32)) {
			return true;
		}

		return false;
	}

}
