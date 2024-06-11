package Estudos;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2)	Escreva um algoritmo em Java, que leia um número inteiro via teclado e 
		 * mostre na tela uma mensagem indicando se este número é par ou ímpar e se 
		 * o número é positivo ou negativo.
		 */
		
		int n;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nDigite um número: ");
		n = read.nextInt();
		
		if (n %2 == 0 && n>0) {
			System.out.println("\nO número "+n+" é par e positivo.");
		}else if (n %2 == 0 && n<0) {
			System.out.println("\nO número "+n+" é par e negativo.");
		}else if (n %2 != 0 && n>0) {
			System.out.println("\nO número "+n+" é ímpar e positivo.");
		}else {
			System.out.println("\nO número "+n+" é ímpar e negativo.");
		}

	}

}
