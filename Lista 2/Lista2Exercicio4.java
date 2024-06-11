package Estudos;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*4)	Escreva um algoritmo em Java, que leia 3 palavras (String), 
		 * que definem as características de um tipo de animal possível segundo 
		 * o diagrama no documento, que deve ser lido da esquerda para a direita.
		 */
		
		String estrutura, classe, alimento;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("\n\t\t\t\t\tMenu das Características de um Animal");
		System.out.println("\n\t\t\t1 - Vertebrados");
		System.out.println("\n\t\t2 - Ave");
		System.out.println("\n\t3 - Onívoro");
		System.out.println("\n\t3 - Carnívoro");
		System.out.println("\n\t\t2 - Mamífero");
		System.out.println("\n\t3 - Herbívoro");
		System.out.println("\n\t3 - Onívoro");
		
		System.out.println("\n\t\t\t1 - Invertebrados");
		System.out.println("\n\t\t2 - Inseto");
		System.out.println("\n\t3 - Herbívoro");
		System.out.println("\n\t3 - Hematófago");
		System.out.println("\n\t\t2 - Anelídeo");
		System.out.println("\n\t3 - Onívoro");
		System.out.println("\n\t3 - Hematófago");
		
		System.out.println("\nDigite a primeira característica de acordo com a tabela acima: ");
		estrutura = read.nextLine();
		System.out.println("\nDigite a segunda característica de acordo com a tabela acima: ");
		classe = read.nextLine();
		System.out.println("\nDigite a terceira característica de acordo com a tabela acima: ");
		alimento = read.nextLine();
		
		if (estrutura.equalsIgnoreCase("Vertebrados")) {
			if (classe.equalsIgnoreCase("Ave")) {
				if (alimento.equalsIgnoreCase("Carnívoro")) {
					System.out.println("\nO animal é uma águia.");
				} else {
					System.out.println("\nO animal é uma pomba.");
				}
						
			} else if (classe.equalsIgnoreCase("Mamífero")) {
				if (alimento.equalsIgnoreCase("ónívoro")) {
					System.out.println("\nO animal é um homem.");
				} else {
					System.out.println("\nO animal é uma vaca");
				}
			}
		} else {
			if (classe.equalsIgnoreCase ("Inseto")) {
				if (alimento.equalsIgnoreCase("Hematófago")) {
					System.out.println("\nO animal é uma pulga");
				} else {
					System.out.println("\nO animal é uma lagarta");
				}
			} else if (classe.equalsIgnoreCase("Anelídeo")){
				if (alimento.equalsIgnoreCase ("Hematófago")) {
					System.out.println("\nO animal é um sanguessuga");
				} else {
					System.out.println("\nO animal é uma minhoca");
				}
			}
		}
	}
}

//o equalsignorecase não ignora falta de palavras ou acentos, apenas maiúsculas e minúsculas.
			