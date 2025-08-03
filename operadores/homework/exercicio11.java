package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite 2 números inteiros e um número real:");
		int inteiro01 = leitor.nextInt();
		int inteiro02 = leitor.nextInt();
		double real = leitor.nextDouble();
		System.out.println("O produto do dobro do primeiro número com metade do segundo é: " + (inteiro01 * 2)*(inteiro02/2));
		System.out.println("A soma do triplo do primeiro número com o terceiro é: " + ((inteiro01 * 3) + (real)));
		System.out.println("O valor do terceiro número elevado ao cubo é: " + Math.pow(real, 3));
		leitor.close();
	}

}
