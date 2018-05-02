package clp;

public class ZipArgument extends Argument {
	
	public static String KEY = "-z";

	public ZipArgument() {
		super(KEY);
	}

	@Override
	protected void validate() throws ParsingException {
		
	}
}
