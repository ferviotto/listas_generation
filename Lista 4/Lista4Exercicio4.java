package Estudos;

import java.util.Scanner;

public class Lista4Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 4)	Elabore um algoritmo que leia as notas de uma classe 
		 * com 10 participantes durante 4 bimestres de um ano. 
		 * As 4 notas de cada participante serão armazenadas em uma 
		 * linha de uma matriz de números reais, logo cada linha da 
		 * matriz serão as notas de um participante. Em um vetor de 
		 * números reais, armazene as médias de cada participante e 
		 * exiba as médias de cada um na tela.
		 * */
		
		int[][] matriz = new int[10][4]; 
        float[] medias = new float[10]; 
        
        Scanner read = new Scanner(System.in);

        for (int linha = 0; linha < 10; linha++) {
            System.out.println("Notas do participante " + (linha + 1) + ": ");
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print("Nota do bimestre " + (coluna + 1) + ": ");
                matriz[linha][coluna] = read.nextInt();
            }
        }

    
        for (int i = 0; i < 10; i++) {
            float somaNotas = 0;
            for (int j = 0; j < 4; j++) {
                somaNotas += matriz[i][j];
            }
            medias[i] = (float) somaNotas / 4;
            System.out.println("Média do participante " + (i + 1) + ": " + medias[i]);
        }
    }
}