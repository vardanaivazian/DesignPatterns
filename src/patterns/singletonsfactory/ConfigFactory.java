package patterns.singletonsfactory;

public class ConfigFactory extends AbstractFactory {

	@Override
	Config getConfig(ConfigType type) {
		
		switch(type) {
			case CLASS_INFO:
				return ClassInfoConfig.getInstance();
			case SERVER:
				return ServerConfig.getInstance();
			default:
				return null;
		}
	}
}
