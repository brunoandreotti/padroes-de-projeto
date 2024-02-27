package br.com.cod3r.builder.meal;

import br.com.cod3r.builder.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.model.FastFoodMeal;

public class Client {
	
	public static void main(String[] args) {
		//O objetivo do padrão builder é delegar a criação do objeto para um builder ao invés de instânciar o objeto concreto direto
		// Dividir a criação do projeto em partes


		FastFoodMeal onlyMain = new FastFoodMealBuilder().mainMeal("lanche").build();
		FastFoodMeal onlySideAndDrink = new FastFoodMealBuilder().side("batata").drink("pepsi").build();
		FastFoodMeal onlyDessertAndGift = new FastFoodMealBuilder().dessert("brigadeiro").gift("vale").build();

		System.out.println(onlyMain.toString());
		System.out.println(onlySideAndDrink.toString());
		System.out.println(onlyDessertAndGift.toString());
	}
}