package clp;

public class FileArgument extends Argument {
	
	public static String KEY = "-f";

	public FileArgument(String value) throws ParsingException {
		super(KEY,value);
	}

	@Override
	protected void validate() throws ParsingException {

	}
}
