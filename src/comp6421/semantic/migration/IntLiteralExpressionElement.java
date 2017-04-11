package comp6421.semantic.migration;

import comp6421.semantic.entry.EntryType;
import comp6421.semantic.entry.WordType;
import comp6421.semantic.value.NumberValue;
import comp6421.semantic.value.Value;

public class IntLiteralExpressionElement extends TypedExpressionElement {

	private final int i;

	public IntLiteralExpressionElement(int i) {
		this.i = i;
	}

	@Override
	public Value getValue() {
		return new NumberValue(i);
	}

	@Override
	public EntryType getType() {
		return new WordType("int");
	}

}
