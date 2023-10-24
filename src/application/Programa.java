package application;

import java.util.Locale;
import java.util.Scanner;
import utils.Numeral;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantidade de números para multiplicar: ");
		int n = sc.nextInt();
		
		Numeral[]vetor = new Numeral[n];
		
		
		for(int i=0; i<n; i++) {
			System.out.printf("Informe o %dº número: ", i+1);
			int numero = sc.nextInt();
			vetor[i] = new Numeral(numero);
			vetor[i].multiplica();
			
		}
		for(int i=0; i<n; i++) {
			System.out.println(vetor[i]);
		}
		sc.close();

	}

}
