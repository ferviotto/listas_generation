package Estudos;

import java.util.Scanner;

public class Lista3Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 3)	Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
		 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o 
		 * total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada 
		 * ao digitar uma idade negativa.
		 */
		
		int idade, countPessoas1=0, countPessoas2=0;
		
		Scanner read = new Scanner (System.in);
		
		while (true) {
			System.out.println("\nQual é a sua idade?");
			idade = read.nextInt();
			if (idade < 0) {
				break;
			} else if (idade <21) {
				countPessoas1++;
			} else if (idade>50) {
				countPessoas2++;
			} 
				
			}
		
		System.out.println("\nA quantidade de pessoas menores de 21 anos é: "+countPessoas1);
		System.out.println("\nA quantidade de pessoas maiores de 50 anos é: "+countPessoas2);

	}

}
/* O uso de while (true) cria um loop infinito que só será interrompido manualmente com um comando 
 * break. Esse tipo de loop é útil quando você não sabe antecipadamente quantas vezes o loop deve 
 * ser executado, mas sabe que ele deve continuar até que uma condição específica seja satisfeita.
 */