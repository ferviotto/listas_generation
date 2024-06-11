package Estudos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lista5Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1)	Escreva um programa Java para criar uma Collection ArrayList de Objetos da 
		 * Classe String. O programa deverá solicitar ao usuário, que ele digite via 
		 * teclado 5 cores e deverá adicioná-las individualmente no ArrayList. 
		 * Em seguida, faça o que se pede:
			●	Mostre na tela todas as cores que foram adicionadas. 
			●	Mostre na tela todas as cores que foram adicionadas 
			ordenadas em ordem crescente.
		 */

		ArrayList<String> colorido = new ArrayList<String>();
		Scanner read = new Scanner(System.in);
		
		String cor;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("\nDigite a " + (i + 1) + "º cor: ");
			cor = read.nextLine();
			colorido.add(cor);
		}
		
		System.out.println("\nCores cadastradas: " + colorido);
		
		Collections.sort(colorido);
		System.out.println("\nCores em ordem crescente: " + colorido );
		
	}

}