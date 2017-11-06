package patterns.command.controlpanel.commands;

import patterns.command.controlpanel.Command;
import patterns.command.controlpanel.beans.Light;

/**
 * Created by User
 * Date: 10/19/2017
 * Time: 3:56 PM
 */
public class LightOffCommand implements Command {

	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
