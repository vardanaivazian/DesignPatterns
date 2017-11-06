package patterns.command.controlpanel.beans;

/**
 * Created by User
 * Date: 10/19/2017
 * Time: 2:34 PM
 */
public class Light {
	private String name;

	public Light(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " light is on");
	}
	
	public void off() {
		System.out.println(name + " light is off");
	}
	
}
