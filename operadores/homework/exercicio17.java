package com.estudos.cursojava.operadores.homework;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double latasNecessarias = 0, galoesNecessarios = 0, misturaNecessaria = 0, sobra = 0;
		
		System.out.println("Digite o tamanho da área a ser pintada (m^2): ");
		
		double area = leitor.nextDouble();
		double litrosNecessarios = (area/6.0) * 1.1;
		
		latasNecessarias = Math.ceil(litrosNecessarios/18.0);
		galoesNecessarios = Math.ceil(litrosNecessarios/3.6);
		misturaNecessaria = ((litrosNecessarios % 18)/3.6);
		
		double precoLatas = latasNecessarias * 80;
		double precoGaloes = galoesNecessarios * 25;
		double precoMistura = ((int)(litrosNecessarios / 18)) * 80 + (int)misturaNecessaria * 25;
		
		
		System.out.println("Latas necessárias: " + latasNecessarias);
		System.out.println("Valor necessário para compra em latas: " + precoLatas);
		System.out.println("Galões necessários: " + galoesNecessarios);
		System.out.println("Valor necessário para compra em galões: " + precoGaloes);
		
		System.out.println("Opção econômica para latas e galões: " + ((int)(litrosNecessarios / 18)) + " lata(s) e " + (int)misturaNecessaria + " galão(ões)");
		System.out.println("Valor necessário para compra da mistura: " + precoMistura);
		
		leitor.close();

	}

}
