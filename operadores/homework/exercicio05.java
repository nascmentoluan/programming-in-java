package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o valor em Metros(m): ");
		double valorEmMetros = leitor.nextDouble();
		double valorEmCentimetros = valorEmMetros * 100;
		System.out.println(valorEmMetros + "m equivale a " + valorEmCentimetros + "cm");
		leitor.close();
	}

}
