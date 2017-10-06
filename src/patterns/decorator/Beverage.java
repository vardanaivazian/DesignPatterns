package patterns.decorator;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 2:51 PM
 */
public abstract class Beverage {
	String description = "Unknown description";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
