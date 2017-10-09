package patterns.factory.pizzas;

import patterns.factory.ingredient.factories.PizzaIngredientFactory;

/**
 * Created by User
 * Date: 10/9/2017
 * Time: 12:05 PM
 */
public class ClamPizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;

	public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing name: " + super.name);
		super.dough = pizzaIngredientFactory.createDough();
		super.sauce = pizzaIngredientFactory.createSauce();
		super.cheese = pizzaIngredientFactory.crateCheese();
		super.clam = pizzaIngredientFactory.createClam();
		
	}
}
