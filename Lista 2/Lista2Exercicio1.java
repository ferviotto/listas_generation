package Estudos;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1)	Faça um algoritmo em Java que leia 3 valores inteiros 
		 * A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C. 
		 */
		
		float a, b, c, soma;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nDigite o valor A: ");
		a = read.nextFloat();
		System.out.println("\nDigite o valor B: ");
		b = read.nextFloat();
		System.out.println("\nDigite o valor C: ");
		c = read.nextFloat();
		
		soma = a + b;
		
		if (soma > c) {
		System.out.println("\nA soma de "+a+" + "+b+" > "+c);
		} else if (soma < c) {
			System.out.println("\nA soma de "+a+" + "+b+" < "+c);
		}else {
			System.out.println("\nA soma de "+a+" + "+b+" = "+c);
		}

	}

}
