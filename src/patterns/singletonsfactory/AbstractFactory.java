package patterns.singletonsfactory;

public abstract class AbstractFactory {
	
	enum ConfigType {
		SERVER, CLASS_INFO
	}
	
	abstract Config getConfig(ConfigType type);
	
}
