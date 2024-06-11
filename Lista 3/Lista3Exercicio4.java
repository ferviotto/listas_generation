package Estudos;

import java.util.Scanner;

public class Lista3Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*4)	Uma empresa desenvolveu uma pesquisa interna para conhecer os
 * colaboradores da área de Desenvolvimento e precisam de um sistema 
 * para analisar os dados. Escreva um algoritmo em Java, que leia via
 *  teclado as seguintes informações de cada colaborador:

●	Idade (Número inteiro)
●	Identidade de Gênero (Número Inteiro): 
o	1 – Mulher Cis
o	2 – Homem Cis
o	3 – Não Binário
o	4 – Mulher Trans
o	5 – Homem Trans
o	6 – Outros
●	Pessoa Desenvolvedora (Número Inteiro):
o	1 – Backend
o	2 – Frontend
o	3 – Mobile
o	4 – FullStack

Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja
continuar a leitura dos dados de um novo colaborador ou não (S/N). 
Caso seja pressionada a tecla N, mostre na tela:

●	O número de pessoas desenvolvedoras Backend
●	O número de Mulheres Cis e Trans desenvolvedoras Frontend
●	O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
●	O número de Não Binários desenvolvedores FullStack menores de 30 anos
●	O número total de pessoas que responderam à pesquisa
●	A média de idade das pessoas que responderam à pesquisa

 */
		
	int idade, gen, pd;
	int countBackend = 0, countFrontendMulher = 0, countMobileHomem40Mais = 0, countFullStackNB30Menos = 0;
    int totalPessoas = 0, somaIdade = 0;
    float mediaIdade;
    
    /*count é importante porque é onde colocaremos os dados compilados no final*/
	
	Scanner read = new Scanner (System.in);
	
	while (true) {
	
	System.out.println("\nQual é a sua idade?: ");
	idade = read.nextInt();
	
	System.out.println("\nObserve a tabela abaixo para responder a próxima pergunta.");
	
	System.out.println("\n\t\tIdentidade de Gênero");
	System.out.println("\n1- Mulher Cis");
	System.out.println("\n2- Mulher Trans");
	System.out.println("\n3- Homem Cis");
	System.out.println("\n4- Homem Trans");
	System.out.println("\n5- Não Binário");
	System.out.println("\n6- Outros");
	
	System.out.println("\nQual é a sua identidade de gênero (1-6)?: ");
	gen = read.nextInt();
	
	System.out.println("\nObserve a tabela abaixo para responder a próxima pergunta.");
	
	System.out.println("\n\t\tPessoa Desenvolvedora");
	System.out.println("\n1- Backend");
	System.out.println("\n2- Frontend");
	System.out.println("\n3- Mobile");
	System.out.println("\n4- FullStack");
	
	System.out.println("\nQual é a sua área de atuação (1-4)?: ");
	pd = read.nextInt();
	
	System.out.println("\nDeseja continuar a pesquisa com um outro colaborador? (S/N): ");
    char continuar = read.next().charAt(0);
    
    /*o char é uma variável de um caractere, aqui usamos assim para o charAt(0) ler exatamente o que foi colocado, pois se for S, ele continua o looping
     * se for N, ele para e concatena tudo.*/
    
    totalPessoas++;
    somaIdade += idade;
    mediaIdade = somaIdade / totalPessoas;
    
    if (continuar == 'N' || continuar == 'n') {
        break;}
        	if (pd == 1) {
        		countBackend++;
        		} else if (pd == 2 && (gen == 1 || gen == 2)) {
        			countFrontendMulher++;
        		} else if (pd == 3 && (gen == 3 || gen == 4) && idade > 40) {
    				countMobileHomem40Mais++;
    			} else if (pd == 4 && gen == 5 && idade < 30) {
    				countFullStackNB30Menos++;
    			}
			} 	System.out.println("\nO número total de pessoas que responderam à pesquisa é: "+totalPessoas);
	        	System.out.println("\nA média de idade das pessoas que responderam à pesquisa é: " +mediaIdade);
	        	System.out.println("\nO número de pessoas desenvolvedoras frontend são: " + countBackend);
	        	System.out.println("\nO número de mulheres desenvolvedoras frontend são: " + countFrontendMulher);
	        	System.out.println("\nO número de homens desenvolvedores mobile acima de 40 anos são: " + countMobileHomem40Mais);
	        	System.out.println("\nO número de pessoas não binárias desenvolvedoras fullstack menores de 30 anos são: " + countFullStackNB30Menos);
			}
		}