package Estudos;

import java.util.Scanner;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 3)	Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
		 * Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
		 * Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), 
		 * a idade (inteiro) do doador e se é a primeira doação (boolean). 
		 * De acordo com as Regras para a doação, mostre na tela se o doador está 
		 * Apto ou Não Apto para doar sangue. 
		 */
		
		String nome;
		int idade;
		boolean doacao;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nQual é o nome da pessoa doadora?: ");
		nome = read.nextLine();
		System.out.println("\nQual é a idade da pessoa doadora?: ");
		idade = read.nextInt();
		System.out.println("\nÉ a primeira doação da pessoa doadora?(true/false): ");
		doacao = read.nextBoolean();
		
		if (doacao = false) {
			if (idade >= 18 && idade <= 69) {
				System.out.println("\n"+nome+" está apta para doar.");
			}else {
			System.out.println("\n"+nome+" não está apta para doar.");
			}
		}
		
		if (doacao = true) {
			if (idade >= 18 && idade < 60) {
				System.out.println("\n"+nome+" está apta para doar.");
				}else {
					System.out.println("\n"+nome+" não está apta para doar.");
				}
		}
			
	}

}
