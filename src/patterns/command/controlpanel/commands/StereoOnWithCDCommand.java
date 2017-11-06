package patterns.command.controlpanel.commands;

import patterns.command.controlpanel.Command;
import patterns.command.controlpanel.beans.Stereo;

/**
 * Created by User
 * Date: 10/19/2017
 * Time: 4:01 PM
 */
public class StereoOnWithCDCommand implements Command {

	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(17);
	}

	@Override
	public void undo() {
		stereo.off();
	}
}
