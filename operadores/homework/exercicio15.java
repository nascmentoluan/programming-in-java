package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu ganho por hora e horas trabalhadas: ");
		double ganhoHora = leitor.nextDouble();
		double horasTrabalhadas = leitor.nextDouble();
		double salarioBruto = ganhoHora * horasTrabalhadas;
		double impostoRenda = salarioBruto * 11/100;
		double inss = salarioBruto * 8/100;
		double valorSindicato = salarioBruto * 5/100;
		double salarioLiquido = salarioBruto - (impostoRenda + inss + valorSindicato);
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("Imposto de Renda: " + impostoRenda);
		System.out.println("INSS: " + inss);
		System.out.println("Valor Sindicato: " + valorSindicato);
		System.out.println("Salário Líquido: " + salarioLiquido);
		
		leitor.close();

	}

}
