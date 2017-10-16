package patterns.singletonsfactory;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public interface Config {
	
	Map<String, String> getProperties();
	
	void setTrigger(TimeUnit unit);
	
}
