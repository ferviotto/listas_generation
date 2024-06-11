package Estudos;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1)	Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java: 
		 * início: digite o salário, leia o salário.
		 * digite o abono, leia o abono.
		 * novoSalario = salário+abono, exiba o novoSalario
		 * fim
		 */
		
		float salario, abono, novoSalario;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nDigite o salário: ");
		salario = read.nextFloat();
		System.out.println("\nDigite o abono: ");
		abono = read.nextFloat();
		
		novoSalario = (salario + abono);
		
		System.out.println("\nO novo salário é: "+novoSalario);

		

	}

}
