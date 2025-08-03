package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double pesoExcedente = 0, multa = 0;
		
		System.out.println("Digite o peso:");
		double pesoPeixes = leitor.nextDouble();
		
		if (pesoPeixes > 50) {
			pesoExcedente = pesoPeixes - 50;
			multa = pesoExcedente * 4;
		}
		
		System.out.println("Peso de peixes trago: " + pesoPeixes);
		System.out.println("Peso de peixes excedentes: " + pesoExcedente);
		System.out.println("Valor da multa sobre peso excedente: " + multa);
		leitor.close();
	}

}
