package patterns.factory.ingredient.factories;

import patterns.factory.ingredient.cheeses.Cheese;
import patterns.factory.ingredient.clams.Clams;
import patterns.factory.ingredient.doughs.Dough;
import patterns.factory.ingredient.pepperonies.Pepperoni;
import patterns.factory.ingredient.sauces.Sauce;
import patterns.factory.ingredient.veggies.Veggies;

/**
 * Created by User
 * Date: 10/9/2017
 * Time: 11:30 AM
 */
public interface PizzaIngredientFactory {
	
	Dough createDough();
	Sauce createSauce();
	Cheese crateCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
	
}
