package patterns.command.controlpanel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User
 * Date: 10/19/2017
 * Time: 2:36 PM
 */
public class RemoteControl {
	private List<Command> onCommands;
	private List<Command> offCommands;
	private Command lastCommand;

	public RemoteControl() {
		onCommands = new ArrayList<>();
		offCommands = new ArrayList<>();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands.add(slot, onCommand);
		offCommands.add(slot, offCommand);
	}
	
	public void onButtonWasPressed(int slot) {
		if(onCommands.get(slot) != null) {
			onCommands.get(slot).execute();
			lastCommand = onCommands.get(slot);
		} else {
			throw new RuntimeException("unknown Command (onButtonWasPressed) by slot: " + slot);
		}
	}
	
	public void offButtonWasPressed(int slot) {
		if(onCommands.get(slot) != null) {
			offCommands.get(slot).execute();
			lastCommand = offCommands.get(slot);
		} else {
			throw new RuntimeException("unknown Command (offButtonWasPressed) by slot: " + slot);
		}
	}
	
	public void undoButtonWasPressed() {
		if(lastCommand != null) {
			lastCommand.undo();
		} else {
			throw new RuntimeException("no previous commands");
		}
	}


	@Override
	public String toString() {
		return "RemoteControl{" +
				"offCommands=" + offCommands +
				", onCommands=" + onCommands +
				'}';
	}
}
