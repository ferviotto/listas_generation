package Estudos;

import java.util.Scanner;

public class Lista4Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3)	Elabore um algoritmo que leia uma Matriz 3x3 de 
		 * números inteiros e em seguida, mostre na tela:
●	Todos os elementos da Diagonal Principal
●	Todos os elementos da Diagonal Secundária
●	A Soma de todos os elementos da Diagonal Principal
●	A Soma de todos os elementos da Diagonal Secundária
 */
		 int[][] matriz = new int[3][3];
	        int somaDiagonalP = 0, somaDiagonalS = 0;
	        
	        Scanner read = new Scanner(System.in);
	        
	        for (int linha = 0; linha < 3; linha++) {
	            for (int coluna = 0; coluna < 3; coluna++) {
	                System.out.println("Entre com o valor da linha " + linha + " e coluna " + coluna + ": ");
	                matriz[linha][coluna] = read.nextInt();
	            }
	        }
	        
	        System.out.println("Elementos da Diagonal Principal:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print(matriz[i][i] + " ");
	            somaDiagonalP += matriz[i][i];
	        }
	        System.out.println("\nSoma da Diagonal Principal: " + somaDiagonalP);
	        
	        System.out.println("Elementos da Diagonal Secundária:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print(matriz[i][2 - i] + " ");
	            somaDiagonalS += matriz[i][2 - i];
	        }
	        System.out.println("\nSoma da Diagonal Secundária: " + somaDiagonalS);
	    }
	}