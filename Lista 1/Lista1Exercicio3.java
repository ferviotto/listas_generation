package Estudos;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3)	Elabore um algoritmo em Java, que leia o Salário Bruto, 
		 * o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, 
		 * em variáveis do tipo float e exiba na tela o Salário Líquido. 
		 */
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiq;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nO salário bruto é de: ");
		salarioBruto = read.nextFloat();
		System.out.println("\nO adicional noturno é de: ");
		adicionalNoturno = read.nextFloat();
		System.out.println("\nAs horas extras são de: ");
		horasExtras = read.nextFloat();
		System.out.println("\nOs descontos são de: ");
		descontos = read.nextFloat();
		
		salarioLiq = (salarioBruto + adicionalNoturno + (horasExtras * 5)- descontos);
		
		System.out.println("\nO salário líquido é de: "+salarioLiq);
		
		

	}

}
