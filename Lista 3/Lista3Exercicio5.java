package Estudos;

import java.util.Scanner;

public class Lista3Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*5)	Escreva um algoritmo em Java, que leia
		 *  números inteiros via teclado, até que o número zero
		 *   seja digitado. Ao final, mostre na tela a soma de todos
		 *    os números digitados, que sejam positivos. 
		 * */
		
		int n, soma=0;
		
		Scanner read = new Scanner (System.in);
		
		do {
			System.out.println("\nDigite um número inteiro: ");
			n = read.nextInt();
			if (n > 0) {
				soma += n;
				}
		}while (n != 0);
		
		System.out.println("\nA soma dos números positivos é: "+soma);
		n = read.nextInt();
		}
}



