package com.mendonca;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		List<Integer> listaValores ;
		Scanner console = new Scanner(System.in);
		
		String inputs = console.nextLine();		
		String valores[] = inputs.split("([ ])+");
		
	
		listaValores = List.of( Integer.parseInt(valores[0]), Integer.parseInt(valores[1]),Integer.parseInt(valores[2])   );
		
		listaValores.stream().sorted().forEach(n -> System.out.println(n));
		System.out.println();
		
		listaValores.stream().forEach(n -> System.out.println(n));

	}

}
