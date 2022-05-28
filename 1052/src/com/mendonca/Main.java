package com.mendonca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		Map<Integer, String> meses = new HashMap<Integer, String>();
		
		meses.put(1, "January");
		meses.put(2, "February");
		meses.put(3, "March");
		meses.put(4, "April");
		meses.put(5, "May");
		meses.put(6, "June");
		meses.put(7, "July");
		meses.put(8, "August");
		meses.put(9, "September");
		meses.put(10, "October");
		meses.put(11, "November");
		meses.put(12, "December");
		
		int input =  Integer.parseInt(console.nextLine());
		
		System.out.println(meses.get(input));
		
		

	}

}
