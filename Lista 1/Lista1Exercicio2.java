package Estudos;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2)	Elabore um algoritmo em Java que leia 4 notas de um participante, 
		 * em variáveis do tipo float e exiba na tela a média final do participante. 
		 */
		
		float n1, n2, n3, n4, media;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nEntre com a primeira nota do participante: ");
		n1 = read.nextFloat();
		System.out.println("\nEntre com a segunda nota do participante: ");
		n2 = read.nextFloat();
		System.out.println("\nEntre com a terceira nota do participante: ");
		n3 = read.nextFloat();
		System.out.println("\nEntre com a quarta nota do participante: ");
		n4 = read.nextFloat();
		
		media = (n1+n2+n3+n4)/4; 
		
		System.out.printf("\nA media do participante é: %.2f",media);
		media = read.nextFloat();
		
		

	}

}
