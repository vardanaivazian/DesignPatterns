package patterns.singleton;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 7:45 PM
 */
public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton(){}

	public static LazyInitializedSingleton getInstance() {
		if(instance == null) instance = new LazyInitializedSingleton();
		return instance;
	}
	
}
