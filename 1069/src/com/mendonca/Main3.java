package com.mendonca;



import java.util.Scanner;

public class Main3 {

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

		int open = 0;
		int diamonts = 0;

		char letra;

			for (int index = 0; index < diamont.length(); index++) {
               
				letra = diamont.charAt(index);
				
				if(letra == '<') {
					open++;
				}else {
					
					if(letra=='>' && open > 0) {
						open--;
						diamonts++;
					}

				}

			}
           
	return diamonts;
	}

}

