package com.mendonca;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		int input1 =  Integer.parseInt(console.next());
		
		int input2 = Integer.parseInt(console.next());
		
		double  result  =  (input1 * input2) / 12;
		
		System.out.println(df.format(result));
		
		

	}

}
