package patterns.singletonsfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ServerConfig implements Config {

	public static Map<String, String> serverPropertiesDummy = new HashMap<>();
	
	private static String DEFAULT_FILENAME = "classInfo.properties";

	private String filename;

	private static Config instance = null;

	public ServerConfig(String filename) {
		this.filename = filename;
	}

	public static Config getInstance() {
		if(instance == null) instance = new ServerConfig(DEFAULT_FILENAME);
		return instance;
	}

	public static Config getInstance(String filename) {
		if(instance == null) instance = new ServerConfig(filename);
		return instance;
	}


	@Override
	public Map<String, String> getProperties() {
		return serverPropertiesDummy;
	}


	@Override
	public void setTrigger(TimeUnit unit) {
		
	}
}
