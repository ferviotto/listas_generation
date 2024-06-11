package Estudos;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 4)	Leia quatro valores float (n1, n2, n3, n4). 
		 * A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto 
		 * entre o n3 e o n4. 
		 */
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = read.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		n2 = read.nextFloat();
		System.out.println("\nEntre com o terceiro número: ");
		n3 = read.nextFloat();
		System.out.println("\nEntre com o quarto número: ");
		n4 = read.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("\nA diferença entre a multiplicação dos dois primeiros números e a multiplicação dos dois últimos números é: "+diferenca);
		

	}

}
