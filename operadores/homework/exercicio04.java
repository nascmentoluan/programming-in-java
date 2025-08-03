package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite 4 notas bimestrais: ");
		int numero01 = leitor.nextInt();
		int numero02 = leitor.nextInt();
		int numero03 = leitor.nextInt();
		int numero04 = leitor.nextInt();
		double media = (numero01 + numero02 + numero03 + numero04)/4;
		System.out.println("A média das notas é: " + media);
		leitor.close();

	}

}
