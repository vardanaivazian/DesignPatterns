package patterns.singleton;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 8:16 PM
 */
public class NestedClassSingleton {
	private NestedClassSingleton(){}

	private static class SingletonHolder {
		private static final NestedClassSingleton INSTANCE = new NestedClassSingleton(); 
	}
	
	public static NestedClassSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	
}
