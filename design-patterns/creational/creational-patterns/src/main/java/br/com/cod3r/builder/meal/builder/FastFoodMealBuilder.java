package br.com.cod3r.builder.meal.builder;

import br.com.cod3r.builder.meal.model.FastFoodMeal;

public class FastFoodMealBuilder implements IFastFoodMealBuilder {

    private String drink;
    private String mainMeal;
    private String side;
    private String dessert;
    private String gift;

    @Override
    public IFastFoodMealBuilder drink(String drink) {
        this.drink = drink;
        return this;
    }

    @Override
    public IFastFoodMealBuilder mainMeal(String mainMeal) {
        this.mainMeal = mainMeal;
        return this;
    }

    @Override
    public IFastFoodMealBuilder side(String side) {
        this.side = side;
        return this;
    }

    @Override
    public IFastFoodMealBuilder dessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    @Override
    public IFastFoodMealBuilder gift(String gift) {
        this.gift = gift;
        return this;
    }

    @Override
    public FastFoodMeal build() {
        return new FastFoodMeal(drink, mainMeal, side, dessert, gift);
    }
}
