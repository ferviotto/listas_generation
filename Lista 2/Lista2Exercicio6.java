package Estudos;

import java.util.Scanner;

public class Lista2Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*6)	Com base na tabela do documento, escreva um algoritmo em Java que leia o 
		 * Nome do Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a 6) 
		 * e o Salário (número float). A seguir, mostre na tela o Nome do Colaborador, 
		 *  o Cargo e o novo Salário reajustado.
		 * 
		 */
		
		String nome;
		int o;
		float s, ns, g=10, v=7, su=9, m=6, e=5, ti=8;
		
		System.out.println("\n\tCódigo do Cargo \tCargo \t\t\tPercentual do Reajuste");
		System.out.println("\n\t1 \t\t\tGerente \t\t\t10%");
		System.out.println("\n\t2 \t\t\tVendedor \t\t\t7%");
		System.out.println("\n\t3 \t\t\tSupervisor \t\t\t9%");
		System.out.println("\n\t4 \t\t\tMotorista \t\t\t6%");
		System.out.println("\n\t5 \t\t\tEstoquista \t\t\t5%");
		System.out.println("\n\t6 \t\t\tTécnico de TI \t\t\t8%");
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\nDigite o nome da pessoa colaboradora: ");
		nome = read.nextLine();
		System.out.println("\nQual é o cargo de "+nome+"? (1-6):");
		o = read.nextInt();
		
		switch (o) {
		case 1:
			System.out.println("\nQual é o salário da pessoa colaboradora?: ");
			s = read.nextFloat();
			ns = s*(100+g)/100;
			System.out.println("\nA pessoa colaboradora "+nome+" é Gerente e seu novo salário é R$"+ns);
		break;
		case 2:
			System.out.println("\nQual é o salário da pessoa colaboradora?: ");
			s = read.nextFloat();
			ns = s*(100+v)/100;
			System.out.println("\nA pessoa colaboradora "+nome+" é Vendedor e seu novo salário é R$"+ns);
		break;
		case 3:
			System.out.println("\nQual é o salário da pessoa colaboradora?: ");
			s = read.nextFloat();
			ns = s*(100+su)/100;
			System.out.println("\nA pessoa colaboradora "+nome+" é Supervisor e seu novo salário é R$"+ns);
		break;
		case 4:
			System.out.println("\nQual é o salário da pessoa colaboradora?: ");
			s = read.nextFloat();
			ns = s*(100+m)/100;
			System.out.println("\nA pessoa colaboradora "+nome+" é Motorista e seu novo salário é R$"+ns);
		break;
		case 5:
			System.out.println("\nQual é o salário da pessoa colaboradora?: ");
			s = read.nextFloat();
			ns = s*(100+e)/100;
			System.out.println("\nA pessoa colaboradora "+nome+" é Estoquista e seu novo salário é R$"+ns);
		break;
		case 6:
			System.out.println("\nQual é o salário da pessoa colaboradora?: ");
			s = read.nextFloat();
			ns = s*(100+ti)/100;
			System.out.println("\nA pessoa colaboradora "+nome+" é Técnico de TI e seu novo salário é R$"+ns);
		break;
		}

	}

}
