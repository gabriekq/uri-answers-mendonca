package com.mendonca;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		String input;
		String []inputs;
		
		
		while (true) {

			
            if(console.hasNext()) {
            	input = console.nextLine();
                
            }else {
            	break;
            }
			inputs = input.split("([ ])+");

			BigInteger valor = fatorial(new BigInteger(inputs[0]));

			BigInteger valor2 = fatorial(new BigInteger(inputs[1]));

			BigInteger soma = sumFatorial(valor, valor2);

			System.out.println(soma.toString());
		}

	}

	public static BigInteger fatorial(BigInteger num) {

		BigInteger anterior = num.subtract(new BigInteger("1"));
		BigInteger fatorialDess = new BigInteger("0");

		if (num.longValue() <= 1) {

			return new BigInteger("1");
		} else {
			fatorialDess = fatorial(anterior).multiply(new BigInteger(String.valueOf(num)));
		}

		return fatorialDess;
	}

	public static BigInteger sumFatorial(BigInteger num, BigInteger num2) {

		return num.add(num2);
	}

}
