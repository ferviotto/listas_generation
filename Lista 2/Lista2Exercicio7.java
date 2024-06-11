package Estudos;

import java.util.Scanner;

public class Lista2Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*7)	Com base na tabela do documento, escreva um algoritmo em Java, que simule uma Calculadora 
		 * simples. O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o 
		 * Código da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado 
		 * da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a 
		 * mensagem Operação Inválida!
		 */
		
		System.out.println("\n\tCódigo \t\t\tOperação");
		System.out.println("\n\t1 \t\t\tSoma");
		System.out.println("\n\t2 \t\t\tSubtração");
		System.out.println("\n\t3 \t\t\tMultiplicação");
		System.out.println("\n\t4 \t\t\tDivisão");
		
		float n1, n2, r;
		int o;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = read.nextFloat();
		System.out.println("\nDigite o segundo número: ");
		n2 = read.nextFloat();
		System.out.println("\nConforme a tabela, digite o código da opção que deseja (1-4): ");
		o = read.nextInt();
		
		switch (o) {
		case 1:
			r = n1 + n2;
			System.out.println(+n1+" + "+n2+" = "+r);
			break;
		case 2:
			r = n1 - n2;
			System.out.println(+n1+" - "+n2+" = "+r);
			break;
		case 3:
			r = n1 * n2;
			System.out.println(+n1+" X "+n2+" = "+r);
			break;
		case 4:
			r = n1 / n2;
			System.out.println(+n1+" / "+n2+" = "+r);
			break;
		}

	}

}
