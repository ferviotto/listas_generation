package Estudos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Lista5Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3)	Escreva um programa Java para criar uma Collection Set de 
		 * Objetos da Classe Wrapper Integer. O programa deverá solicitar 
		 * ao usuário, que ele digite via teclado 10 valores inteiros não 
		 * repetidos e adicione-os individualmente na Collection Set. 
		 * Em seguida, faça o que se pede:
		●	Mostre na tela todos os elementos da Collection Set, 
		utilizando a Classe Iterator. 
		 */

		Set<Integer> numeros = new HashSet<Integer>();
		
		Scanner read = new Scanner(System.in);
		
		int numero;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("\nDigite um número inteiro: ");
			numero = read.nextInt();
			numeros.add(numero);
		}
		
		System.out.println("\nLista dos números inteiros: ");
		Iterator<Integer> inumeros = numeros.iterator();
		
		while (inumeros.hasNext() ) {
			System.out.println(inumeros.next());
		}
		
	}

}