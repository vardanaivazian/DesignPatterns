package patterns.factory.pizzas;

import patterns.factory.ingredient.cheeses.Cheese;
import patterns.factory.ingredient.clams.Clams;
import patterns.factory.ingredient.doughs.Dough;
import patterns.factory.ingredient.pepperonies.Pepperoni;
import patterns.factory.ingredient.sauces.Sauce;
import patterns.factory.ingredient.veggies.Veggies;

import java.util.Arrays;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 4:02 PM
 */
public abstract class Pizza {
	
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies[] veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350 ");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into the diagonals slice");
	}
	
	public void box(){
		System.out.println("Place pizza in official pizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"name='" + name + '\'' +
				", dough=" + dough +
				", sauce=" + sauce +
				", veggies=" + Arrays.toString(veggies) +
				", cheese=" + cheese +
				", pepperoni=" + pepperoni +
				", clam=" + clam +
				'}';
	}
}
