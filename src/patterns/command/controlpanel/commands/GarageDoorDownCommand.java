package patterns.command.controlpanel.commands;

import patterns.command.controlpanel.Command;
import patterns.command.controlpanel.beans.GarageDoor;

/**
 * Created by User
 * Date: 10/24/2017
 * Time: 2:13 PM
 */
public class GarageDoorDownCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
	}

	@Override
	public void undo() {
		garageDoor.up();
	}
}
