package comp6421.semantic.code;

public abstract class Instruction {

	private String label;
	private String comment;

	public Instruction() {
		label = "";
		comment = "";
	}

	protected abstract String code();

	public String getCode() {
		return label + "\t" + code() + "\t% " + comment;
	}

	public Instruction setLabel(String label) {
		this.label = label;
		return this;
	}

	public Instruction setComment(String comment) {
		this.comment = comment;
		return this;
	}

}
