package patterns.decorator;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 2:56 PM
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + this.beverage.cost();
	}
}
