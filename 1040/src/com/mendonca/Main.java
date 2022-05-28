package com.mendonca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in); 
		
		String notas = console.nextLine();
		
		String valoresNotas[] = notas.split(" ");
		
		double media = mediaPonderada(Double.parseDouble(valoresNotas[0]), Double.parseDouble(valoresNotas[1]),Double.parseDouble(valoresNotas[2]),Double.parseDouble(valoresNotas[3]));
		
		if( (media >= 5.0) && (media <= 6.9)  ) {
			double notaExame = Double.parseDouble(console.nextLine());
			System.out.println("Media: "+String.format("%.2f", media).substring(0, 3));
			System.out.println("Aluno em exame.");
			System.out.println("Nota do exame: "+notaExame);
			double mediaFinal =  ((notaExame+media)/2);
			
			if( mediaFinal >= 5   ) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: "+mediaFinal);

		}else {
			
			System.out.println("Media: "+String.format("%.2f", media).substring(0, 3));
			if(media > 6.9) {
				System.out.println("Aluno aprovado.");
			}else {
			    System.out.println("Aluno reprovado.");
			}
		}
		

	}

	private static double mediaPonderada(double nota1, double nota2, double nota3,double nota4) {
		
		double media = ((nota1*2)+(nota2*3)+(nota3*4)+(nota4*1) )/10;
		
		return media;
	}

}
