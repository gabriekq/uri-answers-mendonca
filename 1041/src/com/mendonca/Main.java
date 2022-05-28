package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String valor = console.nextLine();
		
        String valores[] = valor.split(" ");
		
		String resultado = defineCoordinates(Double.parseDouble((valores[0])),Double.parseDouble((valores[1]))  );
		System.out.println(resultado);
	}

	private static String defineCoordinates(double valueX, double valueY) {
	
		if((valueX != 0) && (valueY==0)) {
			return "Eixo X";
		}
		
		if((valueX == 0) && (valueY != 0)) {
			return "Eixo Y";
		}
		
		if(valueX > 0 && valueY > 0 ) {
			return "Q1";
		}
		
		if(valueX < 0 && valueY > 0 ) {
			return "Q2";
		}
		
		if(valueX < 0 && valueY < 0 ) {
			return "Q3";
		}
		
		if(valueX > 0 && valueY < 0 ) {
			return "Q4";
		}
		
		return "Origem";
	}

}
