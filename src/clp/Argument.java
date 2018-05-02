package clp;

public abstract class Argument {
	private String key,value;
	
	public String getKey()
	{
		return key;
	}

	protected Argument(String key){
		this.key=key;
	}
	
	public String getValue()
	{
		return value;
	}
	
	protected Argument(String key, String value) throws ParsingException {
		this.key=key;
		this.value=value;
		validate();
	}

	abstract protected void validate() throws ParsingException;
}
