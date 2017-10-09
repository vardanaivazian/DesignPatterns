package patterns.factory.ingredient.factories;

import patterns.factory.ingredient.cheeses.Cheese;
import patterns.factory.ingredient.clams.Clams;
import patterns.factory.ingredient.doughs.Dough;
import patterns.factory.ingredient.pepperonies.Pepperoni;
import patterns.factory.ingredient.sauces.Sauce;
import patterns.factory.ingredient.veggies.Veggies;
import patterns.factory.ingredient.cheeses.ReggianoCheese;
import patterns.factory.ingredient.clams.FreshClams;
import patterns.factory.ingredient.doughs.ThinCrustDough;
import patterns.factory.ingredient.pepperonies.SlicedPepperoni;
import patterns.factory.ingredient.sauces.MariannaSauce;
import patterns.factory.ingredient.veggies.Garlic;
import patterns.factory.ingredient.veggies.Onion;

/**
 * Created by User
 * Date: 10/9/2017
 * Time: 11:37 AM
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MariannaSauce();
	}

	@Override
	public Cheese crateCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}
