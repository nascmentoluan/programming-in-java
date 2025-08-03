package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite o valor da temperatura em Farenheint:");
		double tempertaturaFarenheint = leitor.nextDouble();
		double temperaturaCelsius = (5 * (tempertaturaFarenheint - 32) / 9);
		System.out.println(tempertaturaFarenheint + " graus Farenheint equivalem a " + temperaturaCelsius + " graus Celsius.");
		leitor.close();
	}

}
