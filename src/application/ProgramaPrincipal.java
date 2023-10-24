package application;

import java.util.Locale;
import java.util.Scanner;
import utils.Product;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		
		System.out.print("Informe o produto: ");
		prod.name = sc.next();
		System.out.print("Informe o preço do produto: ");
		prod.price = sc.nextDouble();
		System.out.print("Informe a quantidade no estoque: ");
		prod.quantity = sc.nextInt();
		
		System.out.println(prod.toString()); //Não precisa digitar o ".toString()"
		
		System.out.print("Adicione nova quantidade do produto no estoque: ");
		prod.addProducts(sc.nextInt()); 
		
		System.out.println(prod); //implicitamente a classe Product que tambem é do tipo object chama o toString().
		
		System.out.print("Retire quantidade do produto do estoque: ");
		prod.removeProducts(sc.nextInt());
		
		System.out.println(prod);
		
		sc.close();

	}

}
