package Estudos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Lista5Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*4)	Escreva um programa Java para criar uma Collection Set de 
		 * Objetos da Classe Wrapper Integer, inicializada com 10 valores 
		 * inteiros. O programa deverá solicitar ao usuário, que ele digite 
		 * via teclado 1 número inteiro e caso ele seja encontrado no Set, 
		 * exiba na tela a mensagem: Número 00 Encontrado! 
		 * Caso o número não seja encontrado, ele deverá exibir na tela a 
		 * mensagem: O número NN não foi encontrado!*/
		
		Set<Integer> numeros = new HashSet<Integer>();
		int numero;
		
		Scanner read = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(2);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que você quer encontrar: ");
		numero = read.nextInt();
		
		if (numeros.contains(numero)) {
			System.out.println("\nO número " + numero + " foi encontrado!");
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
		
	}

}

