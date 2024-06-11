package Estudos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lista6Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1)	Escreva um programa Java contendo uma Collection Queue (Fila) 
		 * de Objetos da Classe String, para organizar a ordem de chegada dos 
		 * Clientes de um Banco. O programa deverá ter um Menu que aceitará 
		 * as opções 0, 1, 2 e 3:
		●	1: Adicionar um novo Cliente na fila. Deve solicitar o nome do 
		Cliente.
		●	2: Listar todos os Clientes na fila
		●	3: Chamar (retirar) uma pessoa da fila 
		●	0: O programa deve ser finalizado. 
		Caso a fila esteja vazia, o programa deverá informar que a fila 
		está vazia ao tentar retirar (chamar) um cliente da fila..
		 */
		
		Queue<String> filaClientes = new LinkedList<String>();
		int op;
		
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("\n \t Menu:");
			System.out.println("\n1 - Adicionar cliente na fila.");
			System.out.println("\n2 - Listar todos os Clientes.");
			System.out.println("\n3 - Retirar cliente da fila.");
			System.out.println("\n0 - Sair");
			
			System.out.println("\nEntre com a opção desejada: ");
			op = read.nextInt();
			read.nextLine();  
			
			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				String nomeCliente = read.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("\n" + nomeCliente + " adicionade.");
				break;
				
			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila se encontra vazia.");
				} else {
					System.out.println("\nClientes na fila: ");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;
				
			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila se encontra vazia.");
				} else {
					String clienteChamado = filaClientes.poll();
					System.out.println("\n" + clienteChamado + " foi chamade.");
					System.out.println("Fila atual: ");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;
			
			case 0:
				System.out.println("\nO programa finalizou.");
				break;
			
				default:
					System.out.println("\nOpção inválida. Por favor, digite uma opção válida.");
			}
				
		} while (op != 0);
	}
}