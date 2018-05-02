package clp;

import java.util.ArrayList;
import java.util.List;

public class Parser {
	public static List<Argument> parse(String arguments[]) throws ParsingException {
		List<Argument> argumentList = new ArrayList<Argument>();
		
		if("help".equals(arguments[2]))
		{
			return argumentList;
		}
		
		int index=2;
		while(index<arguments.length)
		{
			if(("-").equals(arguments[index].charAt(0)))
			{
				if(index+1<arguments.length && !("-").equals(arguments[index].charAt(0)))
				{
					argumentList.add(ArgumentFactory.getArgument(arguments[index],arguments[index+1]));
					index +=2;
				}
				else
				{
					argumentList.add(ArgumentFactory.getArgument(arguments[index],null));
					index +=1;
				}
			}
			else
			{
				throw new ParsingException("Invalid command line argument " + arguments[index] + " at postion "+(index+1));
			}
		}
		return argumentList;
	}
}
