package br.com.Application;

import java.util.Locale;
import java.util.Scanner;

import br.com.controller.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner (System.in); 
		System.out.println("Digite a categoria:");
		String categoria = sc.next();
		System.out.println("Digite a descri��o:");
		String descri��o = sc.next();
		System.out.println("Digite o valor:");
		Double valor = sc.nextDouble();
		sc.close();
		Product prod = new Product();
		prod.setCategory(categoria);
		prod.setDescription(descri��o);
		prod.setValue(valor);
		System.out.println("Welcome System!");
		System.out.println("O �tem "+ prod.getDescription() + ","
				+ " da categoria = "+ prod.getCategory() + 
				" com o valor de R$"+prod.getValue() + 
				" foi inclu�do com sucesso!");
	
	}

}
