package comp6421;

public class Token {
	protected EType TYPE = null;//the type of the token
	protected String value = null;//the value of the token
	protected int position = 0;//line in the file
	protected String error = "";//error message if have
	
	public Token(int p, EType type, String v) {
		this.position = p;
		this.TYPE = type;
		this.value = v;
	}
	
	public Token(int p, EType type, String v, String e) {
		this.position = p;
		this.TYPE = type;
		this.value = v;
		this.error = e;
	}

	public EType getTYPE() {
		return TYPE;
	}

	public void setTYPE(EType tYPE) {
		TYPE = tYPE;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
