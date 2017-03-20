package comp6421.semantic;

public class InternalCompilerError extends CompilerError {

	private static final long serialVersionUID = 8493063881477288950L;

	public InternalCompilerError(String message) {
		super("Internal: " + message);
	}

}
