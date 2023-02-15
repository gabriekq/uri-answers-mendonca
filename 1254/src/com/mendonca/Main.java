package com.mendonca;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner console = new Scanner(new File("c:\\file.txt"));
	//	Scanner console = new Scanner( System.in );
		
		while (console.hasNext()) {

			String wordTarget = console.nextLine();
			String wordReplace = console.nextLine();
			String targetText = console.nextLine();

			String finalResult = replaceValues(wordTarget, wordReplace, targetText);
			System.out.println(finalResult);	
		}

	}

	private static String replaceValues(String wordTarget, String wordReplace, String targetText) {
		StringBuilder finalResult = new StringBuilder();
		
		for(int index=0;index<targetText.length();index++) {
			
			if(targetText.charAt(index) != '<'  &&  targetText.charAt(index) != '>' ) {
				finalResult.append(targetText.charAt(index));
			}else {
				
				int indexLeft = targetText.indexOf("<", index);
				
			    String sectionText = createFinalSection(targetText,wordTarget,wordReplace,indexLeft);
			    finalResult.append(sectionText);
			    if(targetText.indexOf(">", index) != -1 ) {
			    	index = targetText.indexOf(">", index);
			    }else {
			    	
			    	if(!sectionText.contains(">")) {
			    		break;
			    	}		    	
			    } 
			    
			}
			
		}
		
		return finalResult.toString();
	}

	private static String createFinalSection(String targetText, String wordTarget, String wordReplace, int indexStart) {
		String section ;
		
		
		for(int currentIndex=indexStart ;  ;currentIndex++) {
			
			if( (currentIndex == (targetText.length()-1))  || targetText.charAt(currentIndex) == '>'  ) {
					 section = targetText.substring(indexStart, currentIndex+1);
				break;
			}	
		}
		
		  String result   = findAndReplace(section,wordTarget.toLowerCase(),wordReplace);
		
		return result;
	}

	private static String findAndReplace(String section, String wordTarget, String wordReplace) {
				
		String valuesFound[]  = section.substring(1, section.length()-1).split(" ");
		boolean needReplace = false;
		int sizeOfReplacement =0, startReplaceFrom=0  ;
		String targetWord=null;
		
		for(String word :valuesFound) {
			
			if(word.toLowerCase().contains(wordTarget)) {
				needReplace = true;
				sizeOfReplacement = wordTarget.length();
				startReplaceFrom =	section.toLowerCase().substring(0, section.length()-1).indexOf(wordTarget);
				 targetWord =	section.substring(startReplaceFrom, sizeOfReplacement+startReplaceFrom);
				break;
			}
		}
		
		if(needReplace) {
			section = section.replace(targetWord,wordReplace );
			 return  findAndReplace( section,  wordTarget,  wordReplace);
		}else {
			return section;
		}
		
	} 




}
