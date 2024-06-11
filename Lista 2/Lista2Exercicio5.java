package Estudos;

import java.util.Scanner;

public class Lista2Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 5)	Com base na tabela abaixo, escreva um algoritmo em Java que leia o código 
		 * de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
		 * A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
		 */
		int o, q, p, cq=10, xs=15, xb=18, b=12, r=8, sc=13;
		
		System.out.println("\n\tCódigo do Produto \tProduto \t\t\tPreço Unitário");
		System.out.println("\n\t1 \t\t\tCachorro Quente \t\tR$10,00");
		System.out.println("\n\t2 \t\t\tX-Salada \t\t\tR$15,00");
		System.out.println("\n\t3 \t\t\tX-Bacon \t\t\tR$18,00");
		System.out.println("\n\t4 \t\t\tBauru \t\t\t\tR$12,00");
		System.out.println("\n\t5 \t\t\tRefrigerante \t\t\tR$8,00");
		System.out.println("\n\t6 \t\t\tSuco de Laranja \t\tR$13,00");
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Entre com o código do produto desejado (1-6): ");
		o = read.nextInt();
		
		switch (o) {
		case 1:
			System.out.println("\nO produto escolhido foi o Cachorro Quente.");
			System.out.println("Qual a quantidade desejada?: ");
			q = read.nextInt();
			p = q*cq;
			System.out.println("O cliente deve pagar R$"+p);
			break;
		case 2:
			System.out.println("\nO produto escolhido foi o X-Salada.");
			System.out.println("Qual a quantidade desejada?: ");
			q = read.nextInt();
			p = q*xs;
			System.out.println("O cliente deve pagar R$"+p);
			break;
		case 3:
			System.out.println("\nO produto escolhido foi o X-Bacon.");
			System.out.println("Qual a quantidade desejada?: ");
			q = read.nextInt();
			p = q*xb;
			System.out.println("O cliente deve pagar R$"+p);
			break;
		case 4:
			System.out.println("\nO produto escolhido foi o Bauru.");
			System.out.println("Qual a quantidade desejada?: ");
			q = read.nextInt();
			p = q*b;
			System.out.println("O cliente deve pagar R$"+p);
			break;
		case 5:
			System.out.println("\nO produto escolhido foi o Refrigerante.");
			System.out.println("Qual a quantidade desejada?: ");
			q = read.nextInt();
			p = q*r;
			System.out.println("O cliente deve pagar R$"+p);
			break;
		case 6:
			System.out.println("\nO produto escolhido foi o Suco de Laranja.");
			System.out.println("Qual a quantidade desejada?: ");
			q = read.nextInt();
			p = q*sc;
			System.out.println("O cliente deve pagar R$"+p);
			break;
		}
	}

}
