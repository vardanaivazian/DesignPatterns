package patterns.decorator;

/**
 * Created by User
 * Date: 10/6/2017
 * Time: 2:58 PM
 */
public class HaldiCoCoffee {

	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println("Espresso description: " + espresso.description + ", cost: " + espresso.cost());
		
		
		Beverage mochaEspresso = new Mocha(espresso);

		System.out.println("mocha + espresso: description: " + mochaEspresso.description + ", cost: " + mochaEspresso.cost());
	}
}
