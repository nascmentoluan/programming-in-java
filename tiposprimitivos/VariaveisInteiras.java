package com.estudos.cursojava.tiposprimitivos;

public class VariaveisInteiras {
	
	public static void main (String[] args) {
		
		byte idade01 = 15;
		
		short idade02 = 17;
		
		int idade03 = 18;
		
		long idade04 = 20l;
		
		System.out.println("Valor da variável idade01: " + idade01);
		System.out.println("Valor da variável idade02: " + idade02);
		System.out.println("Valor da variável idade03: " + idade03);
		System.out.println("Valor da variável idade04: " + idade04);
		
		//pegadinha técnica
		System.out.println("\nExceder limite valores de uma variavel inteira 'reseta' o seu resultado. ");

		int valor01 = 2147483647;
		int valor02 = 1;
		
		System.out.println("\nSoma do valor das variáveis excede o limte para um inteiro.\nResultado reseta para o início do intervalo válido (casas negativas): ");
		System.out.println(valor01 + valor02);
		
		//valores octais, decimais, hexadecimais e binarios
		
		int decVal = 26;
		
		int hexVal = 0x1a;
		
		int octVal = 032;
		
		int binVal = 0b11010; // a partir JDK 07
	}

}
