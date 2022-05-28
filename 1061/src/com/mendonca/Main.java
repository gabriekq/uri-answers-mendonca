package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String linha1 = console.nextLine();
		String linha2 = console.nextLine();
		
		String linha3 = console.nextLine();
		String linha4 = console.nextLine();
		
		long dia= Long.parseLong(linha1.split("([ ])+")[1]) ;
		long hora=  Long.parseLong( linha2.split("([ : ])+")[0]) ;
		long minuto = Long.parseLong( linha2.split("([ : ])+")[1]) ;
		long segundo = Long.parseLong( linha2.split("([ : ])+")[2]) ;
		
		long dia2= Long.parseLong(linha3.split("([ ])+")[1]) ;
		long hora2=  Long.parseLong( linha4.split("([ : ])+")[0]) ;
		long minuto2 = Long.parseLong( linha4.split("([ : ])+")[1]) ;
		long segundo2 = Long.parseLong( linha4.split("([ : ])+")[2]) ;
		
		long diaF =  dia2-dia;
		long horaF = hora2-hora;
		long minutoF = minuto2-minuto;
		long segundoF = segundo2 - segundo;
		
		if(segundoF < 0) {
			segundoF = segundoF + 60;
			minutoF = minutoF - 1;
		}
		
		if(minutoF < 0) {
			minutoF = minutoF + 60;
			horaF = horaF - 1;
		}
		
		if(horaF < 0) {
			horaF = horaF + 24;
			diaF = diaF - 1;
		}
		
		

		System.out.println(diaF+" dia(s)");
		System.out.println(horaF+" hora(s)");
		System.out.println(minutoF+" minuto(s)");
		System.out.println(segundoF+" segundo(s)");

	}

}
