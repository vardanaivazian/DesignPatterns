package patterns.command.controlpanel.beans;

/**
 * Created by User
 * Date: 10/19/2017
 * Time: 3:59 PM
 */
public class Stereo {
	
	String name;

	public Stereo(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(name + " Stereo is on.");
	}
	
	
	public void off() {
		System.out.println(name + " Stereo is off.");
	}
	
	
	public void setCD() {
		System.out.println(name + " Stereo is sets CD.");
	}
	
	public void setDVD() {
		System.out.println(name + " Stereo is sets DVD.");
	}
	
	public void setVolume(int volume) {
		System.out.println(name + " Stereo is sets volume: " + volume);
	}
	
	
}
