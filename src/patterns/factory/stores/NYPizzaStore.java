package patterns.factory.stores;

import patterns.factory.ingredient.factories.NYPizzaIngredientFactory;
import patterns.factory.ingredient.factories.PizzaIngredientFactory;
import patterns.factory.pizzas.CheesePizza;
import patterns.factory.pizzas.PepperoniPizza;
import patterns.factory.pizzas.Pizza;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 4:06 PM
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		
		switch(type) {
			case "cheese":
				pizza = new CheesePizza(pizzaIngredientFactory);
				pizza.setName("New York style Cheese Pizza.");
				break;
			case "pepperoni":
				pizza = new PepperoniPizza(pizzaIngredientFactory);
				pizza.setName("New York style Pepperoni Pizza.");
			default:
				return pizza;
		}
		return pizza;
	}
}
