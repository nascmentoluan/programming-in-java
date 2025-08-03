package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite dois números:");
		int numero01 = leitor.nextInt();
		int numero02 = leitor.nextInt();
		int soma = numero01 + numero02;
		System.out.println("A soma dos dois números é: " + soma);
		leitor.close();
	}

}
