package patterns.command.controlpanel;

import patterns.command.controlpanel.beans.GarageDoor;
import patterns.command.controlpanel.beans.Light;
import patterns.command.controlpanel.beans.Stereo;
import patterns.command.controlpanel.commands.GarageDoorDownCommand;
import patterns.command.controlpanel.commands.GarageDoorUpCommand;
import patterns.command.controlpanel.commands.LightOffCommand;
import patterns.command.controlpanel.commands.LightOnCommand;
import patterns.command.controlpanel.commands.StereoOffCommand;
import patterns.command.controlpanel.commands.StereoOnWithCDCommand;

/**
 * Created by User
 * Date: 10/19/2017
 * Time: 2:39 PM
 */
public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room light");
		Light kitchenLight = new Light("Kitchen light");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		Command kitchenLightOn = new LightOnCommand(kitchenLight);
		Command kitchenLightOff = new LightOffCommand(kitchenLight);
		
		Command garageDoorUp = new GarageDoorUpCommand(garageDoor);
		Command garageDoorDown = new GarageDoorDownCommand(garageDoor);

		Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		Command stereoOff = new StereoOffCommand(stereo);
		
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		
		
		remoteControl.onButtonWasPressed(0);
		remoteControl.undoButtonWasPressed();
		
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);

		remoteControl.onButtonWasPressed(3);
		remoteControl.undoButtonWasPressed();
		
		
	}
}
