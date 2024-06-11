package Estudos;

import java.util.Scanner;

public class Lista4Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2)	Elabore um algoritmo que leia 10 números inteiros 
		 * e armazene em um vetor. Em seguida, mostre na tela:
●	Todos os elementos dos índices ímpares do vetor 
●	Todos os elementos do vetor que são números pares
●	A Soma de todos os elementos do vetor
●	A Média de todos os elementos do vetor, armazenada em uma 
variável do tipo real
*/
		
		int vetor [] = new int [10];
		int x, soma = 0;
		float media = 0;
		
		Scanner read = new Scanner (System.in);
		
		for (x=0; x<10; x++) {
            System.out.println("\nDigite um número: ");
            vetor[x] = read.nextInt();
        }

        System.out.println("\nElementos dos índices ímpares do vetor:");
        for (x=1; x<10; x+=2) {
            System.out.println("Índice " + x + ": " + vetor[x]);
        }
        
        /*Aqui eu quero acessar os índices ímpares, por isso o X+=2
         * Ex: int[] vetor = {10, 21, 32, 43, 54, 65, 76, 87, 98, 109};
			O loop for (int x = 1; x < 10; x += 2) fará o seguinte:
			Na primeira iteração, x = 1, acessa vetor[1] que é 21.
			Na segunda iteração, x = 3, acessa vetor[3] que é 43.
			Na terceira iteração, x = 5, acessa vetor[5] que é 65.
			Na quarta iteração, x = 7, acessa vetor[7] que é 87.
			Na quinta iteração, x = 9, acessa vetor[9] que é 109.
         */

        System.out.println("\nElementos pares do vetor:");
        for (x=0; x<10; x++) {
            if (vetor[x] % 2 == 0) {
                System.out.println("Elemento " + vetor[x]);
            }
        }

        for (x=0; x< 10; x++) {
            soma += vetor[x];
        }

        media = (float) soma / 10;

        System.out.println("\nA soma de todos os elementos do vetor é: " + soma);
        System.out.println("\nA média de todos os elementos do vetor é: " + media);
	}
}