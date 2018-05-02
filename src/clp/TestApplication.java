package clp;

public class TestApplication {
	public static void main(String[] args) {
		String url = args[0];
		String commandType = args[1];
		
		validateUrl(url);
		
		Command command = CommandFactory.getCommand(commandType);
		
		int exitCode = -1;
		try {
			exitCode = command.execute(args);
		} catch (ParsingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.exit(exitCode);
	        
	}

	private static void validateUrl(String url) {
//        if (!RestAdaptor.isUrlAccessible(url)) {
//            System.err.println("The connection to " + url + " does not seem to work!\n");
//        }
	}
}
