package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da área a ser pintada (m^2): ");
		double area = leitor.nextDouble();
		double latasNecessarias = Math.ceil(((area/3)/18));
		double precoFinal = latasNecessarias * 80;
		System.out.println("Latas necessárias: " + latasNecessarias);
		System.out.println("Valor necessário para compra: " + precoFinal);
		
		leitor.close();

	}

}
