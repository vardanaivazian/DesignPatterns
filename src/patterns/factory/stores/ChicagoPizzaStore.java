package patterns.factory.stores;

import patterns.factory.ingredient.factories.ChicagoPizzaIngredientFactory;
import patterns.factory.ingredient.factories.PizzaIngredientFactory;
import patterns.factory.pizzas.CheesePizza;
import patterns.factory.pizzas.PepperoniPizza;
import patterns.factory.pizzas.Pizza;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 4:07 PM
 */
public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		
		switch(type) {
			case "cheese":
				pizza = new CheesePizza(pizzaIngredientFactory);
				pizza.setName("Chicago style Cheese Pizza.");
				break;
			case "clam":
				pizza = new PepperoniPizza(pizzaIngredientFactory);
				pizza.setName("Chicago style Clam Pizza");
			default:
				return pizza;
		}
		return pizza;
	}
}
