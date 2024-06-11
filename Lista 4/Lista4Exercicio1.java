package Estudos;

import java.util.Scanner;

public class Lista4Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1)	Dado um vetor contendo 10 números inteiros não ordenados 
		 * e não repetidos, construa um algoritmo que consiga pesquisar dados
		 * no vetor, onde o usuário irá digitar um número e o programa 
		 * deve exibir na tela a posição deste número no vetor. 
		 * Caso o número não seja encontrado, a mensagem: 
		 * “Não foi encontrado!” deve ser exibida na tela
		 * */
		
		int[] numero = new int[10];
        int n, x;
        boolean encontrado = false;

        Scanner read = new Scanner(System.in);

        for (x = 0; x < 10; x++) {
            System.out.println("\nEscreva o número de posição " + x + ": ");
            numero[x] = read.nextInt();
        }

        System.out.println("\nDigite o número que deseja encontrar: ");
        n = read.nextInt();

        for (x = 0; x < 10; x++) {
            if (numero[x] == n) {
                System.out.println("\nO número " + n + " está na posição " + x + " do vetor.");
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("\nNão foi encontrado!");
        }
    }
}