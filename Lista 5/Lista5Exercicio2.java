package Estudos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista5Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2)	Escreva um programa Java para criar uma Collection 
		 * ArrayList de Objetos da Classe Wrapper Integer, inicializada 
		 * com 10 valores inteiros. O programa deverá solicitar ao 
		 * usuário, que ele digite via teclado 1 número inteiro e caso 
		 * ele seja encontrado no ArrayList, exiba na tela a posição 
		 * deste número na Collection. Caso o número não seja encontrado,
		 *  ele deverá exibir na tela a mensagem: O número NN não foi 
		 *  encontrado!*/
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		Scanner read = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		int numero, posicao=0;
		
		System.out.println("\nDigite o número que você quer encontrar: ");
		numero = read.nextInt();
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == numero) {
				posicao = i;
				break;
			}
		}
		
		if (posicao != -1) {
			System.out.println("\nO número " + numero + " está na posição " + posicao);
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado.");
		}
	}

}
