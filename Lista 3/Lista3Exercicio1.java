package Estudos;

import java.util.Scanner;

public class Lista3Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1)	Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
		 * onde o primeiro número deve ser menor do que o segundo número. Caso contrário, 
		 * deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
		 * No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.
		 */
		
		int n1, n2, x;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = read.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = read.nextInt();
		
		if(n1 > n2) {
			System.out.println("\nO intervalo é inválido.");
		} else {
			System.out.println("\nO intervalo é válido.");
			for (x = n1; x<n2; x++) {
				if (x % 3 == 0 && x % 5 == 0) {
				System.out.println("\nNo intervalo entre "+n1+" e "+n2+" "+x+" é multíplo de 3 e 5.");
			}
		}
			
		}	

	}
}
/* Aqui a nossa condição é que o n1 seja menor que n2, então depois de cumprimos isso, a nossa variável 
 * looping x precisa estar vinculada aos números que foram colocados. E, como queremos que mostre os números
 * entre os dois citados, precisamos que ele vá colocando +1. Depois é só imprimir.*/
