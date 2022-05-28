package com.mendonca;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		TreeMap<Long, String> valores = new TreeMap<Long, String>();
		
		int nCase = Integer.parseInt(console.nextLine());
		
		for(int index=0;index<nCase;index++) {
		
			String input = console.nextLine();
			String variaveis[] = input.split("([ ])+");
			
			long xValue = Long.parseLong(variaveis[0]);
			long yValue = Long.parseLong(variaveis[1]);
			
		    valores.put( funcRafael(xValue,yValue),"Rafael"   );
		    valores.put( funcBeto(xValue,yValue),"Beto");
		    valores.put( founcCarlos(xValue,yValue),"Carlos");	
		    
		    System.out.println(valores.lastEntry().getValue()+" ganhou");
		    valores.clear();
		}

	}
	
	
	public static long funcRafael(long x,long y) {
		return  (long) (Math.pow( (x*3) , 2) + Math.pow(y, 2)) ;
	}
	
	public static long funcBeto(long x,long y) {
		return   (long) ((2 *  Math.pow(x,2)) + Math.pow( (5*y), 2));
	}
	
	public static long founcCarlos(long x,long y) {
		return (long) ((-100*x)+ Math.pow(y, 3));
	}
	

}
