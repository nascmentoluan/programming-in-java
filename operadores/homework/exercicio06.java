package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o valor do raio do círculo: ");
		double valorRaio = leitor.nextDouble();
		double areaCirculo = (valorRaio * valorRaio) * 3.14;
		System.out.println("A área do círculo de raio " + valorRaio + "equivale a " + areaCirculo);
		leitor.close();
	}

}
