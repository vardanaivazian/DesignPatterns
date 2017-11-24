package patterns.templatemethod;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 6:23 PM
 */
public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(costumerWantsCondiments()) {
			addCondiments();
		}
	}

	protected abstract void brew();

	protected abstract void addCondiments();
	
	
	protected void boilWater() {
		System.out.println("Boiling water.");
	}

	protected void pourInCup() {
		System.out.println("Pouring into cup.");
	}
	
	protected boolean costumerWantsCondiments() {
		return true;
	}

}
