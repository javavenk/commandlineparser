package clp;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
	
	private static Map<String,Command> commands = new HashMap<String,Command>();
	
	public static Command getCommand(String command)
	{
		if(commands.size()==0)
		{
			initialize();
		}
		return commands.get(command);
	}

	private static void initialize() {
		// TODO Auto-generated method stub
	}
}
