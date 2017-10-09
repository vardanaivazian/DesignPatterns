package patterns.factory;

import patterns.factory.pizzas.Pizza;
import patterns.factory.stores.ChicagoPizzaStore;
import patterns.factory.stores.NYPizzaStore;
import patterns.factory.stores.PizzaStore;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 5:37 PM
 */
public class PizzaTestDrive {
	public static void main(String[] args) {
		
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Bob ordered Pizza: " + pizza.getName());
		
		pizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Ann ordered Pizza: " + pizza.getName());
		
	}
}
