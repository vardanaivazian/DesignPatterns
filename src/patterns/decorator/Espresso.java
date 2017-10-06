package patterns.decorator;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 2:54 PM
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
