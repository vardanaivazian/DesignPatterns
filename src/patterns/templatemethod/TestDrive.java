package patterns.templatemethod;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 6:53 PM
 */
public class TestDrive {

	public static void main(String[] args) {
		
		CaffeineBeverage tea = new Tea();
		CaffeineBeverage coffee = new Cofee();

		System.out.println("\nMaking tea...");
		tea.prepareRecipe();

		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
		
	}
	
}
