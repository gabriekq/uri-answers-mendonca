package com.mendonca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
        Scanner console = new Scanner(System.in);
        ArrayList<Long> fibonatti = new ArrayList<Long>();
		
		int Ncasos = Integer.valueOf(console.next());
		
		
		for(int indexCasos=0; indexCasos < Ncasos;indexCasos++  ) {
		
			int value = Integer.valueOf(console.next());
			value = value + 1;
			
			fibonatti.add(0, Long.valueOf(0)  );
			for(int indexFibo=1; indexFibo < value;indexFibo++  ) {
				
				if(indexFibo== 1) {
					fibonatti.add(indexFibo, Long.valueOf(1));
				}else {
					fibonatti.add(indexFibo,fibonatti.get(indexFibo -1) + fibonatti.get(indexFibo -2)   );	
				}	
			}
			
			value = value - 1;
			System.out.println("Fib("+value+") = "+fibonatti.get(value)+"");
			fibonatti.clear();
		}
		
		
		
		

	}

}
