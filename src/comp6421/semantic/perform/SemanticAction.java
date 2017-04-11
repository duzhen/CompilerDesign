package comp6421.semantic.perform;

import comp6421.scanner.Token;
import comp6421.semantic.SemanticException;

public interface SemanticAction {

	public abstract void execute(Token precedingToken) throws SemanticException;
	
}
