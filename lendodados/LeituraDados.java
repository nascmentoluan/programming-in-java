package com.estudos.cursojava.lendodados;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = leitura.nextLine();
		
		System.out.println("Digite o seu gênero:");
		String genero = leitura.next();
		
		System.out.println("Digite a sua Idade:");
		int idade = leitura.nextInt();
		
		System.out.println("Digite o seu peso:");
		double peso = leitura.nextDouble();
		
		System.out.println("Está estudando? (true/false)");
		boolean estadoDeEstudo = leitura.nextBoolean();
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Gênero digitado: " + genero);
		System.out.println("Idade digitada: " + idade);
		System.out.println("Peso digitado: " + peso);
		System.out.println("Está estudando: " + estadoDeEstudo);
	}

}
