package patterns.singletonsfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ClassInfoConfig implements Config {

	public static Map<String, String> classInfoPropertiesDummy = new HashMap<>();
	
	private static String DEFAULT_FILENAME = "classInfo.properties";
	
	private String filename;
	
	private static Config instance = null;

	private ClassInfoConfig() {}

	public ClassInfoConfig(String filename) {
		this.filename = filename;
	}

	public static Config getInstance() {
		if(instance == null) instance = new ClassInfoConfig();
		return instance;
	}
	
	public static Config getInstance(String filename) {
		if(instance == null) instance = new ClassInfoConfig(filename);
		return instance;
	}


	@Override
	public Map<String, String> getProperties() {
		return classInfoPropertiesDummy;
	}

	@Override
	public void setTrigger(TimeUnit unit) {
		
	}
}
