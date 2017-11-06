package patterns.command.controlpanel.commands;

import patterns.command.controlpanel.Command;
import patterns.command.controlpanel.beans.Stereo;

/**
 * Created by User
 * Date: 10/24/2017
 * Time: 2:16 PM
 */
public class StereoOffCommand implements Command {

	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}


	@Override
	public void undo() {
		stereo.on();
	}
}
