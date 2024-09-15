package com.thiagosilva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringBuilder builder;
		Scanner sc;

		System.out.println("Digite a string a ser analisada: ");
		String string = new Scanner(System.in).nextLine();
		String stringFormatada = string.replaceAll("[\\p{Punct},\\s]", "");
		String stringReverse = new StringBuilder(stringFormatada).reverse().toString();

		if (stringFormatada.equalsIgnoreCase(stringReverse)) {
			System.out.println("A string '" + string + "' é um palíndromo.");
		}
		else {
			System.out.println("A string '" + string + "' não é um palíndromo.");
		}

	}
}
