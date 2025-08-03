package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o valor da temperatura em Celsius:");
		double temperaturaCelsius = leitor.nextDouble();
		double temperaturaFarenheint = ((temperaturaCelsius * 9)/5 + 32);
		System.out.println(temperaturaCelsius + " graus Celsius equivalem a " + temperaturaFarenheint + " graus Farenheint.");
		leitor.close();
	}

}
