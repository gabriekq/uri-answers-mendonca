package com.mendonca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		ArrayList<Double> ladosTrinangulo = new ArrayList<Double>();
		
		String valor = console.nextLine();
		
		String valores[] = valor.split(" ");
		
		ladosTrinangulo.add(Double.parseDouble(valores[0]));
		ladosTrinangulo.add(Double.parseDouble(valores[1]));
		ladosTrinangulo.add(Double.parseDouble(valores[2]));	
	    ladosTrinangulo.sort(Comparator.reverseOrder());
		
		
	if(isFormaTriangulo(ladosTrinangulo.get(0),ladosTrinangulo.get(1)  ,ladosTrinangulo.get(2)) == false  ) {
		System.out.println("NAO FORMA TRIANGULO");
	}else {
		
		
	System.out.println(	tipoTriangulo(Math.pow(ladosTrinangulo.get(0), 2),Math.pow(ladosTrinangulo.get(1), 2), Math.pow(ladosTrinangulo.get(2), 2)));
		
	String caractTrinangulo = caractTriangulo(ladosTrinangulo.get(0),ladosTrinangulo.get(1),ladosTrinangulo.get(2));
		if(caractTrinangulo != null) {
			System.out.println(caractTrinangulo);
		}
	}
		
	}

	private static String caractTriangulo(Double lado1, Double lado2, Double lado3) {
		HashSet<Double> lados = new HashSet<Double>();
		lados.add(lado1);
		lados.add(lado2);
		lados.add(lado3);
		if(lados.size()== 1) {
			return "TRIANGULO EQUILATERO";
		}
		
		if(lados.size()== 2) {
			return "TRIANGULO ISOSCELES";
		}
		return null;
	}

	private static boolean isFormaTriangulo(double a, double b, double c) {
		if( (a < (b+c)) &&  (b < (a+c) )  && (c < (a+b) )  ) {
			return true;	
		}else {
			return false;
		}
	}
	
	private static String tipoTriangulo(double qA,double qB,double qC) {
		if(qA == (qB+qC) ) {
			return "TRIANGULO RETANGULO";
		}
		if(qA > (qB+qC)) {
			return "TRIANGULO OBTUSANGULO";
		}
		return "TRIANGULO ACUTANGULO";
	}
	
	

	

}
