package com.mendonca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		
		Scanner console = new Scanner(System.in);
		
		Map<String, String> languages = new HashMap<>(36);
		languages.put("brasil", "Feliz Natal!");
		languages.put("alemanha" , "Frohliche Weihnachten!");
		languages.put("austria", "Frohe Weihnacht!");
		languages.put("coreia", "Chuk Sung Tan!");
		languages.put("espanha", "Feliz Navidad!");
		languages.put("grecia", "Kala Christougena!");
		languages.put("estados-unidos", "Merry Christmas!");
		languages.put("inglaterra", "Merry Christmas!");
		languages.put("australia", "Merry Christmas!");
		languages.put("portugal", "Feliz Natal!");
		languages.put("suecia", "God Jul!");
		languages.put("turquia", "Mutlu Noeller");
		languages.put("argentina", "Feliz Navidad!");
		languages.put("chile", "Feliz Navidad!");
		languages.put("mexico", "Feliz Navidad!");
		
		languages.put("antardida", "Merry Christmas!");
		languages.put("canada", "Merry Christmas!");
		languages.put("irlanda", "Nollaig Shona Dhuit!");
		languages.put("belgica", "Zalig Kerstfeest!");
		languages.put("italia", "Buon Natale!");
		languages.put("libia", "Buon Natale!");
		languages.put("siria", "Milad Mubarak!");
		languages.put("marrocos", "Milad Mubarak!");
		languages.put("japao", "Merii Kurisumasu!");
		
		while(console.hasNext()) {
			
			String phrase = console.nextLine();	
			System.out.println(languages.getOrDefault(phrase, "--- NOT FOUND ---"));
			
		}
		
	}

}
