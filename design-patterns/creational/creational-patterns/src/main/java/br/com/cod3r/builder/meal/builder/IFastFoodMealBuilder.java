package br.com.cod3r.builder.meal.builder;

import br.com.cod3r.builder.meal.model.FastFoodMeal;

public interface IFastFoodMealBuilder {

    IFastFoodMealBuilder drink(String drink);
    IFastFoodMealBuilder mainMeal(String mainMeal);
    IFastFoodMealBuilder side(String side);
    IFastFoodMealBuilder dessert(String dessert);
    IFastFoodMealBuilder gift(String gift);

    FastFoodMeal build();
}
