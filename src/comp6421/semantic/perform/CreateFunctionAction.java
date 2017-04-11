package comp6421.semantic.perform;

import comp6421.scanner.Token;
import comp6421.semantic.SemanticException;
import comp6421.semantic.code.Register;
import comp6421.semantic.entry.PrimitiveType;
import comp6421.semantic.entry.VariableEntry;
import comp6421.semantic.expression.ExpressionContext;

public class CreateFunctionAction extends TableStrategy {
	
	@Override
	public void execute(Token precedingToken) throws SemanticException {
		if(context.function != null){
			context.current.add(context.function);
			context.current = context.function.getScope();
			
			ExpressionContext.setCurrentFunction(context.function);
			
			VariableEntry returnPcAddr    = new VariableEntry(Register.RETURN_ADDRESS_PARAMETER_NAME, new PrimitiveType("int"));

			context.current.add(returnPcAddr);

			ExpressionContext.setCurrentFunction(context.function);
		}
	}
}
