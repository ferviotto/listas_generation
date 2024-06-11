package Estudos;

import java.util.Scanner;

public class Lista3Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2)	Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
		 *  mostre na tela quantos números são pares e quantos número são ímpares.
		 */
		
		int n, x, cp=0, ci=0;
		
		Scanner read = new Scanner (System.in);
		
		for (x=1; x<=10; x++) {
			System.out.println("\nDigite o "+x+" º número: ");
			n = read.nextInt();
		
			if (n % 2 == 0) {
				cp++;} else {
					ci++;
				}
		}
			System.out.println("O total de números pares é: "+cp);
			System.out.println("O total de números ímpares é: "+ci);		

	}

}
/* Para manter a contagem e mostrar o resultado depois do loop, usamos essas duas variáveis que conta pares
 * e ímpares, adicionando os números em sua respectiva caixinha. Depois fechamos tudo e colocamos o total de
 * pares e ímpares.
 * */
