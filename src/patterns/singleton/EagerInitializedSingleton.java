package patterns.singleton;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 7:38 PM
 */
public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton(){}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
