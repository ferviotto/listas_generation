programa
{
	
	funcao inicio()
	{
		inteiro vetor[10]
		inteiro soma = 0
		real media = 0.0 

		para(inteiro i = 0; i<=9; i++){
			escreva("Digite "+i+" número para armazenar:")
			leia(vetor[i])
			limpa()
			
		}
		
		para(inteiro i=0; i<10; i++){
			se (i %2 != 0){
			escreva ("\n", vetor [1])
			}
		}
		para(inteiro i=0; i<10; i++){
			se (vetor[i] %2 == 0){
			 escreva ("\n", vetor[i])
			}
		}

		

		para(inteiro i = 0; i<=9; i++){
			soma = soma + vetor[i]
			
		}
		
		
		media = soma / 10.0
		escreva("\n","Soma dos números:", soma)
		escreva("\n","Média dos números:", media)
	}
}
		

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 284; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */