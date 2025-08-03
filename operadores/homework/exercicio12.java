package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a sua altura: ");
		double altura = leitor.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58 ;
		System.out.println("Seu Peso Ideal deve ser de: " + pesoIdeal);
		leitor.close();
	}

}
