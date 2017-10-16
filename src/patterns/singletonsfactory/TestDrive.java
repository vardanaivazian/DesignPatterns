package patterns.singletonsfactory;

import java.util.Map;
import java.util.Set;

public class TestDrive {

	public static void main(String[] args) {
		
		
		ClassInfoConfig.classInfoPropertiesDummy.put("class1", "apiKey1");
		ClassInfoConfig.classInfoPropertiesDummy.put("class2", "apiKey2");
		ClassInfoConfig.classInfoPropertiesDummy.put("class3", "apiKey3");
		
		ServerConfig.serverPropertiesDummy.put("apiUrl", "http://127.0.0.1:8888/");
		ServerConfig.serverPropertiesDummy.put("portalUrl", "http://localhost:8181/portal/");
		ServerConfig.serverPropertiesDummy.put("cmsUrl", "http://127.0.0.1:8888/cms");

		
		AbstractFactory config = new ConfigFactory();

		Config serverConfig = config.getConfig(AbstractFactory.ConfigType.SERVER);
		Config classInfoConfig = config.getConfig(AbstractFactory.ConfigType.CLASS_INFO);

		Map<String, String> serverProp = serverConfig.getProperties();
		Map<String, String> classInfoProp = classInfoConfig.getProperties();


		System.out.println("*************SERVER CONFIG START*********");
		printMap(serverProp);
		System.out.println("*************SERVER CONFIG END*********");
		System.out.println();

		System.out.println("*************CLASS_INFO CONFIG START*********");
		printMap(classInfoProp);
		System.out.println("*************CLASS_INFO CONFIG END*********");
		
	}
	
	
	private static void printMap(Map<String, String> map) {

		Set<String> strings = map.keySet();

		for(String s : strings) {
			System.out.println(s + ": " + map.get(s));
		}

	}
}
