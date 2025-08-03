package com.estudos.cursojava.operadores;

public class Operadores {

	public static void main(String[] args) {
		
		//Operações aritméticas
		int resultado = 1 + 1;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado /2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 2;
		System.out.println(resultado);

		//Operações de incremento e decremento
		
		//Pós-incremento: exibe antes, incrementa depois
		System.out.println(resultado++);
		
		//Pré-incremento: incrementa antes, exibe depois
		System.out.println(++resultado);
		
		//Pré-decremento
		System.out.println(--resultado);
		
		//Pós-decremento
		System.out.println(resultado--);
		
		
		//Operadores de comparação/relacionais
		int valor1 = 1;
		int valor2 = 2;
		
		System.out.println("Valor1 == valor2: " + (valor1 == valor2));
		System.out.println("Valor1 != valor2: " + (valor1 != valor2));
		System.out.println("Valor1 > valor2: " + (valor1 > valor2));
		System.out.println("Valor1 >= valor2: " + (valor1 >= valor2));
		System.out.println("Valor1 < valor2: " + (valor1 < valor2));
		System.out.println("Valor1 <= valor2: " + (valor1 <= valor2));
	
		//Operadores Lógicos
		boolean resultadoLogico01 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor2 é 1 AND valor2 é 2 - resultado: " + resultadoLogico01);
		
		boolean resultadoLogico02 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor2 é 1 OR valor2 é 2 - resultado: " + resultadoLogico02);
		
		System.out.println(resultadoLogico01 && resultadoLogico02);
		System.out.println(resultadoLogico01 || resultadoLogico02);
		System.out.println(resultadoLogico01 ^ resultadoLogico02);
		System.out.println(!(resultadoLogico01 && resultadoLogico02));
		
		//Curto circuito (Lógico)
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultadoLogico03 = falso & verdadeiro;//verifica duas variáveis(bitwise AND)
		boolean resultadoLogico04 = falso && verdadeiro;//verifica apenas uma e já atribui resultado
		System.out.println(resultadoLogico03);
		System.out.println(resultadoLogico04);
		
		
	}

}
