package patterns.command.controlpanel.commands;

import patterns.command.controlpanel.Command;
import patterns.command.controlpanel.beans.Light;

/**
 * Created by User
 * Date: 10/19/2017
 * Time: 2:33 PM
 */
public class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}
