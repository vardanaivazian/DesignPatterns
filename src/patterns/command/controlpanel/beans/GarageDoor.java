package patterns.command.controlpanel.beans;

/**
 * Created by User
 * Date: 10/19/2017
 * Time: 2:42 PM
 */
public class GarageDoor {
	
	public void up() {
		System.out.println("garage door is up.");
	}
	
	public void down() {
		System.out.println("garage door is down.");
	}
	
	public void stop() {
		System.out.println("garage door is stopped.");
	}
	
	public void lightOn() {
		System.out.println("garage light is on.");
	}
	
	public void lightOff() {
		System.out.println("garage light is off.");
	}
	
}
