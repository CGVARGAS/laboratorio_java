package application;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[]nomeVetor = new String[4];
		double[]notaVetor = new double[4];
		double[]mediaVetor = new double[4];
		
		for(int i=0; i<4; i++) {
			double soma=0;
			// Corre o vetor através do indice [i] adicionando os nomes dos alunos.
			System.out.printf("\nInforme o nome do %dª aluno: ", i+1);
			nomeVetor[i] = sc.next();
			sc.nextLine();
			 // "Loop aninhado" para adicionar as 4 notas de cada aluno através do indice [j].
			for(int j=0; j<4; j++) {
				System.out.printf("Informe a %dª nota: ", j+1);
			    notaVetor[j] = sc.nextDouble();
			    // Efetua a soma das notas adicionadas no vetor: 
			    //"notaVetor[j]" e adiciona na variável "nota".
			    soma += notaVetor[j];
			}
			// Efetua o calculo da média e armazena no vetor: "mediaVetor[i]".
			mediaVetor[i] = soma/4;
		}
		// Imprime o nome e á media de cada aluno
		for(int i=0; i<4; i++) {
			System.out.println(" ");
			if(mediaVetor[i] >= 6.00) {
				System.out.printf("Nome: %s", nomeVetor[i]);
				System.out.printf("\nMédia: %.2f", mediaVetor[i]);
				System.out.println("Aluno aprovado");
			}
			else {
				System.out.printf("Nome: %s", nomeVetor[i]);
				System.out.printf("\nMédia: %.2f", mediaVetor[i]);
				System.out.println("\nAluno reprovado");
			}
			
		}
		sc.close();
	}
}
