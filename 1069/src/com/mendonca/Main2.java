package com.mendonca;
// funcionando bem submeter esse
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		
		//1069 no uri enviar
		Scanner console = new Scanner(System.in);

		int nCases = Integer.parseInt(console.nextLine());

		for (int index = 0; index < nCases; index++) {

			String input = console.nextLine();
			int diamonts = countDiamont(input);
			System.out.println(diamonts);
		}

	}

	public static int countDiamont(String diamont) {

		StringBuilder stringBuilder =  new StringBuilder(diamont);
		
		int fistP = stringBuilder.indexOf("<", 0);
		int countA = 0;
		int countB = 0;
		int result =0;
		int menor=0;
	    int maior =0 ;
	
	    if(fistP != -1) {
		for(int index=fistP;index < stringBuilder.length();index++  ) {
			
			if (stringBuilder.charAt(index) == '<') {
				countA++;
			}	
			if (stringBuilder.charAt(index) == '>') {
				countB++;
			}
			
		}
	    }else {
	    	return result;
	    }
		
		if(countA >countB ) {
			menor = countB;
			maior = countA;
					
		}else {
			menor = countA;
			maior = countB;
		}
		
		
		for(int index=0;index < maior;index++  ) {
			
			if(menor != 0) {
				menor --;
				result ++;
			}else {
				break;
			}

		}
		
		return result;
				
	}

}
