package patterns.templatemethod;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 6:18 PM
 */
public class Tea extends CaffeineBeverage {
	
	
	@Override
	protected void brew() {
		System.out.println("Steeping tea.");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding lemon.");
	}

}
