package comp6421.semantic.migration.strategy;

import comp6421.scanner.Token;
import comp6421.semantic.SemanticException;
import comp6421.semantic.code.MathOperation;
import comp6421.semantic.migration.MigrationStrategy;

public class PushAdditionOperationAction extends MigrationStrategy {

	@Override
	public void execute(Token precedingToken) throws SemanticException {
		context.getCurrent().pushAdditionOperator(
				MathOperation.fromToken(precedingToken.lexeme));
	}

}