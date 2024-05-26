package com.mendonca;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		//Scanner console = new Scanner(new File("c:\\file.txt"));
		Scanner console = new Scanner(System.in);
		LinkedList<Integer> values = new LinkedList<>();

		while (console.hasNext()) {

			String line = console.nextLine();

			int valueX = Integer.parseInt(line.split(" ")[0]);
			int valueY = Integer.parseInt(line.split(" ")[1]);
			int valueZ = Integer.parseInt(line.split(" ")[2]);
			
			values.addAll(List.of(valueX,valueY,valueZ));
			values.sort((value1,value2) -> value1.compareTo(value2));
			
			String result = caculatePitagoras(values);
			System.out.println(result);
			values.clear();
		}

	}

	private static String caculatePitagoras(LinkedList<Integer> values) {
		StringBuilder result = new StringBuilder("tripla");

		if ((Math.pow(values.getFirst(),2) + Math.pow(values.get(1), 2)) == Math.pow(values.getLast(),2)) {
			result.append(" pitagorica");
			if (gdc(values) == 1) {

				result.append(" primitiva");
				return result.toString();
			}
			return result.toString();

		} else {
			return result.toString();
		}

	}

	private static int gdc(LinkedList<Integer> values) {
		
		int minValue=0;
		
		for(int index=1;index<values.getFirst();index++  ) {
			
			if(  (values.getFirst() % index ==0) &&  (values.get(1) % index ==0) && (values.getLast() % index ==0) ) {
				minValue = index;
			}
		}
		
		return minValue;
	}

}
