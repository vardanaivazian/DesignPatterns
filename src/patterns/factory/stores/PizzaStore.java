package patterns.factory.stores;

import patterns.factory.pizzas.Pizza;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 4:01 PM
 */
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
}
