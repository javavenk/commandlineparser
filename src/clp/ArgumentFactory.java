package clp;

public class ArgumentFactory {
	public static Argument getArgument(String key) {
		if (ZipArgument.KEY.equals(key)) {
			return new ZipArgument();
		}
		return null;
	}

	public static Argument getArgument(String key, String value) throws ParsingException {
		if (FileArgument.KEY.equals(key)) {
			return new FileArgument(value);
		}
		return null;
	}
}
