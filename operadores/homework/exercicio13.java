package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double pesoIdeal = 0;
		
		System.out.println("Digite a sua altura e sexo: ");
		double altura = leitor.nextDouble();
		leitor.nextLine();
		String sexo = leitor.nextLine();
		
		if ((sexo.equals("M")) || (sexo.equals("m"))) {
			pesoIdeal = (72.7 * altura) - 58 ;
			
		} else if ((sexo.equals("F")) || (sexo.equals("f"))) {
			pesoIdeal =  (62.1 * altura) - 44.7;
		} else {
			System.out.println("Erro: Entrada inesperada.");
		}
		
		System.out.println("Digite o seu peso: ");
		double pesoUsuario = leitor.nextDouble();
		
		System.out.println("Seu Peso Ideal deve ser de: " + pesoIdeal);
		if (pesoUsuario > pesoIdeal) {
			System.out.println("Você está acima do peso.");
		} else if (pesoUsuario < pesoIdeal) {
			System.out.println("Você está abaixo do peso.");
		} else {
			System.out.println("Você está dentro do peso ideal.");
		}
		leitor.close();
	}

}
