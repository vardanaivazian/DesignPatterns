package patterns.command.controlpanel;

/**
 * Created by User
 * Date: 10/19/2017
 * Time: 2:31 PM
 */
public interface Command {
	void execute();
	void undo();
}
