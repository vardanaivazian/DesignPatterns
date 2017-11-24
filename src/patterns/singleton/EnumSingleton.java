package patterns.singleton;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 8:21 PM
 */
public enum  EnumSingleton {
	INSTACE;
	
	private Integer value;
	private String name;


	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
