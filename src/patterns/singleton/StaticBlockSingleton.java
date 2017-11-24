package patterns.singleton;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 7:40 PM
 */
public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton(){}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
