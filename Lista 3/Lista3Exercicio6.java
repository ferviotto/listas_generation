package Estudos;

import java.util.Scanner;

public class Lista3Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*6)	Escreva um algoritmo em Java, que leia números inteiros 
		 * via teclado, até que o número zero seja digitado. 
		 * Ao final, mostre na tela a média de todos os números digitados, 
		 * que sejam múltiplos de 3
		 * */
		
		int n, totalN=0, totalMult3=0;
		float media=0;
		
		Scanner read = new Scanner (System.in);
		
		do {
			System.out.println("\nDigite um número inteiro:");
			n = read.nextInt();
			if (n % 3 == 0 && n != 0) {
				totalN += n;
				totalMult3++;
				
			/*Preciso que os números sejam multíplos de 3 e diferentes de 0, 
			 * assim eu consigo somar eles e adicionar os multiplos na minha
			 * variável
			 * */
			}
		} while (n != 0);
			if (totalMult3 > 0) {
				media = (float) totalN / totalMult3;
			}
			System.out.println("\nA média dos números inteiros múltiplos de 3 é: "+media);
			
			/*Enquanto isso for verdade, preciso que o totalMult seja maior que zero, assim
			 * calculo a média que precisa ser inteirada como floar, senão não vai contar
			 * os decimais.
			 * */
	
	} 
	
}
