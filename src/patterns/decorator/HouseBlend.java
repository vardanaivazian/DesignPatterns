package patterns.decorator;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 2:55 PM
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend coffee";
	}

	@Override
	public double cost() {
		return .89;
	}
}
