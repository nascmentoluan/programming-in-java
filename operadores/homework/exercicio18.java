package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe a velocidade do link (Mb/s) e o tamanho do arquivo (Mb): ");
		
		double velocidadeLink = leitor.nextDouble();
		double tamanhoArqv = leitor.nextDouble();
		double tempoDownld = tamanhoArqv / velocidadeLink;
		
		System.out.println("Seu download ficará pronto em " + tempoDownld + " segundo(s).");
		
		leitor.close();
	}

}
