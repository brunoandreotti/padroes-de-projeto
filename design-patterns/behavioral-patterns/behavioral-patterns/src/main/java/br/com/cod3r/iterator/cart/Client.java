package br.com.cod3r.iterator.cart;

public class Client {

	//O Padrão iterator tem como objetivo prover uma maneira de acessar
	//os elementos de um objeto agregado sequencialmente sem expor sua
	//representação interna

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Cart cart = new Cart(new Product("TV", 1000d), new Product("Shoe", 59.99d), new Product("Pencil", 0.5d));

		for (Product product : cart) {
			System.out.printf("Product: %s%n", product.getDesc());
		}
		
	}
}
