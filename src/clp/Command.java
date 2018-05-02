package clp;

import java.util.List;

public abstract class Command {
	public int execute(String arguments[]) throws ParsingException {
		List<Argument> argumentList = Parser.parse(arguments);
		
		return 0;
	}
}
