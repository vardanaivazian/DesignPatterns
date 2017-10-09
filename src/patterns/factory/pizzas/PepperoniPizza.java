package patterns.factory.pizzas;

import patterns.factory.ingredient.factories.PizzaIngredientFactory;

/**
 * Created by User
 * Date: 10/9/2017
 * Time: 12:11 PM
 */
public class PepperoniPizza extends Pizza {
	
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing name: " + super.name);
		super.dough = pizzaIngredientFactory.createDough();
		super.sauce = pizzaIngredientFactory.createSauce();
		super.cheese = pizzaIngredientFactory.crateCheese();
	}
}
