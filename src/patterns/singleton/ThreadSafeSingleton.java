package patterns.singleton;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 7:47 PM
 */
public class ThreadSafeSingleton {
	
	private static volatile ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton(){}

	public static ThreadSafeSingleton getInstance() {
		if(instance == null) {
			synchronized(ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
}
