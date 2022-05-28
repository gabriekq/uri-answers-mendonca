package com.mendonca;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String data = console.nextLine();

	    List<String>  valoresData = 	Stream.of(data.split("/")).collect(Collectors.toList());
		
	    System.out.println(valoresData.get(1)+"/"+valoresData.get(0)+"/"+valoresData.get(2));
	    System.out.println(valoresData.get(2)+"/"+valoresData.get(1)+"/"+valoresData.get(0));
	    System.out.println(valoresData.get(0)+"-"+valoresData.get(1)+"-"+valoresData.get(2));
		

	}

}
