package patterns.factory.ingredient.factories;

import patterns.factory.ingredient.cheeses.Cheese;
import patterns.factory.ingredient.clams.Clams;
import patterns.factory.ingredient.doughs.Dough;
import patterns.factory.ingredient.pepperonies.Pepperoni;
import patterns.factory.ingredient.sauces.Sauce;
import patterns.factory.ingredient.veggies.Veggies;
import patterns.factory.ingredient.cheeses.Mozzarella;
import patterns.factory.ingredient.clams.FrozenClams;
import patterns.factory.ingredient.doughs.ThickCrustDough;
import patterns.factory.ingredient.pepperonies.SlicedPepperoni;
import patterns.factory.ingredient.sauces.PlumTomatoSauce;
import patterns.factory.ingredient.veggies.BlackOlives;
import patterns.factory.ingredient.veggies.EggPlant;
import patterns.factory.ingredient.veggies.Spinach;

/**
 * Created by User
 * Date: 10/9/2017
 * Time: 11:50 AM
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {


	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese crateCheese() {
		return new Mozzarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new BlackOlives(), new Spinach(), new EggPlant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
