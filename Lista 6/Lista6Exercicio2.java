package Estudos;

import java.util.Scanner;
import java.util.Stack;

public class Lista6Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2)	Escreva um programa Java contendo uma Collection Stack (Pilha)
		 * de Objetos da Classe String, para organizar a retirada de livros 
		 * em uma pilha. O programa deverá ter um Menu que aceitará as opções 
		 * 0, 1, 2 e 3:
			●	1: Adicionar um novo livro na pilha. Deve solicitar o nome do 
			livro.
			●	2: Listar todos os livros da Pilha
			●	3: Retirar um livro da pilha 
			●	0: O programa deve ser finalizado. 
			Caso a pilha esteja vazia e o atendente tente retirar um livro da 
			pilha, ele deverá informar que a pilha está vazia.
		 */
		
		Stack<String> pilhaLivros = new Stack<String>();
		
		Scanner read = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("\n \tMenu");
			System.out.println("\n1 - Adicionar livro na pilha.");
			System.out.println("\n2 - Listar todos os livros.");
			System.out.println("\n3 - Retirar um livro da pilha.");
			System.out.println("\n0 - Sair.");
			
			System.out.println("\nEntre com a opção desejada: ");
			op = read.nextInt();
			read.nextLine();
			
			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do livro para ser adicionado: ");
				String nomeLivro = read.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println("\n" + nomeLivro + " adicionado." );
				System.out.println("\nLivros na pilha: ");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				break;
			
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia.");
				} else {
					System.out.println("\nLivros na pilha: ");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;
				
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia.");
				} else {
					String livroRemovido = pilhaLivros.pop();
					System.out.println("\n" + livroRemovido + " removido.");
					System.out.println("\nLivros na pilha: ");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;
				
			case 0:
				System.out.println("O programa finalizou.");
				break;
				
				default:
					System.out.println("Opção inválida. Por favor, digite uma opção válida.");
			}
		} while (op != 0);
	}
}