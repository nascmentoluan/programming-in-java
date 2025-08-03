package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o valor de um lado do quadrado: ");
		double valorLadoQuadrado = leitor.nextDouble();
		double resultado = (valorLadoQuadrado * valorLadoQuadrado) * 2;
		System.out.println("A área deste quadrado de lado " + valorLadoQuadrado + " equivale a " + resultado/2 + "\nseu dobro é " + resultado);
		leitor.close();
	}

}
