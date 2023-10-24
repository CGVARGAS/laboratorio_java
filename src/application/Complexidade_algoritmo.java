package application;

import java.util.Scanner;

public class Complexidade_algoritmo {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[20];

	        System.out.println("Digite 20 números:");
	        for (int i = 0; i < 20; i++) {
	            System.out.printf("%dº número: ", i + 1);
	            numeros[i] = sc.nextInt();
	        }

	        int contadorPares = 0;
	        for (int i = 0; i < 20; i++) {
	            if (numeros[i] % 2 == 0) {
	                contadorPares++;
	            }
	        }

	        int[] paresVetor = new int[contadorPares];
	        int indicePares = 0;
	        /* Melhor */
	        for (int i = 0; i < 20; i++) {
	            if (numeros[i] % 2 == 0) {
	                paresVetor[indicePares] = numeros[i];
	                indicePares++;
	            }
	        }

	        System.out.println();
	        System.out.print("Números Pares: ");
	        for (int i = 0; i < paresVetor.length; i++) {
	            System.out.print(paresVetor[i]);
	            if (i < paresVetor.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println();
	        System.out.printf("%d números são pares! ", contadorPares);

	        sc.close();
	    }
	}
