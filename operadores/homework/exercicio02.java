package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio02 {
	
	public static void main (String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		int numero = leitor.nextInt();
		System.out.println("O número informado foi " + numero);
		leitor.close();
	}
}
