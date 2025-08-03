package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o quanto você ganha por hora e suas horas trabalhadas: ");
		double valorGanhoHora = leitor.nextDouble();
		int horasTrabalhadas = leitor.nextInt();
		double salario = valorGanhoHora * horasTrabalhadas;
		System.out.println("Seu salário neste mês é de R$ " + salario);
		leitor.close();
	}

}
