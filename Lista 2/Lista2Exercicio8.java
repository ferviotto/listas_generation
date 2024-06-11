package Estudos;

import java.util.Scanner;

public class Lista2Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*8)	Desenvolva um algoritmo em Java para uma conta bancária. 
		 * O programa deverá ler o tipo de operação a ser realizada com base na 
		 * tabela abaixo (número inteiro entre 1 e 3) e o valor a ser depositado ou 
		 * sacado (somente nas opções 2 e 3). Considere que um saque só pode ser realizado 
		 * caso haja saldo suficiente. Ao final de cada operação, exiba o novo Saldo na tela. 
		 * A variável saldo (float), será inicializada com o valor de R$ 1000.00. 
		 * Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida! 
		 */
		System.out.println("\n\tCódigo da Operação \tOperação");
		System.out.println("\n\t1 \t\t\tSaldo");
		System.out.println("\n\t2 \t\t\tSaque");
		System.out.println("\n\t3 \t\t\tDepósito");
		
		int o;
		float saldo=1000, saque, deposito, ns;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nQual operação deseja consultar (1-4)?: ");
		o = read.nextInt();
		
		switch(o) {
		case 1:
			System.out.println("\nO saldo é de R$"+saldo);
		break;
		case 2:
			System.out.println("\nDigite quanto deseja sacar: R$");
			saque = read.nextFloat();
			if (saque <= saldo) {
				ns = saldo - saque;
				System.out.println("\nO novo saldo é de R$"+ns);
			}else {
				System.out.println("\nOperação inválida. Saldo insuficiente.");
			}
		break;
		case 3:
			System.out.println("\nDigite quanto deseja depositar: R$");
			deposito = read.nextFloat();
			ns = saldo + deposito;
			System.out.println("\nO novo saldo é de R$"+ns);
		break;
		}
	}

}
