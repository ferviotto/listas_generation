programa
{
	
	funcao inicio()
	{
		inteiro vetor[10] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}
		para (inteiro i=0; i<10; i++){
			para (inteiro f=i +1; f<10; f++)
			{
				se (vetor[i] < vetor[f]){
					inteiro temp = vetor[i]
					vetor[i] = vetor[f]
					vetor[f] = temp
				}
			}
		}

		      escreva("Ordem Decrescente: ")
		      para (inteiro i=0; i<10; i++)
		      {
		      	escreva(vetor[i], " ")
		      }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */