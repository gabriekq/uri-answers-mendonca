package com.mendonca;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException  {
		
	//	Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		Map<String, Double> productPrice = new HashMap<String, Double>();
		Map<String, Integer> productQuantity = new HashMap<String, Integer>();
		
		
		int nCases = Integer.parseInt(console.nextLine());
		
		for(int indexCases=0;indexCases <nCases;indexCases++ ) {
			
			int casesPrice = Integer.parseInt(console.nextLine());	// for the preco
			for(int indexPrice=0;indexPrice<casesPrice;indexPrice++) {			
				String valuePrice = console.nextLine();
				insertProductPrice(productPrice,valuePrice);
			}
			
			int casesQuantity = Integer.parseInt(console.nextLine());
			for(int indexQuantity=0;indexQuantity < casesQuantity;indexQuantity++) {	
				String valueQuantity = console.nextLine();
				insertProductQuantity(productQuantity,valueQuantity);
			}

			String result = sumQuantityPrice(productQuantity,productPrice);
			System.out.println(result);
			productQuantity.clear();
			productPrice.clear();
		}
	}

	private static String sumQuantityPrice(Map<String, Integer> productQuantity, Map<String, Double> productPrice) {
		
		double finalPrice = 0;
		
		for(String key  : productQuantity.keySet()) {
			finalPrice = finalPrice + ( productQuantity.get(key) * productPrice.get(key));	
		}
		
		return  "R$ "+String.format("%.2f", finalPrice);        
	}

	private static void insertProductQuantity(Map<String, Integer> productQuantity, String valueQuantity) {	
		productQuantity.put(valueQuantity.split(" ")[0],  Integer.parseInt( valueQuantity.split(" ")[1]));
	}

	private static void insertProductPrice(Map<String, Double> productPrice, String valuePrice) {	
		productPrice.put(valuePrice.split(" ")[0],Double.parseDouble(valuePrice.split(" ")[1]));	
	}

}
