package gool.ast.constructs;

import gool.ast.printer.GoolGeneratorController;
import gool.ast.type.IType;

import java.util.Collection;
import java.util.HashSet;


/**
 * This class captures a variable declaration in the intermediate language.
 * Hence it is a Dec.
 * But because declarations are usually OK statements in OO Languages it is also a Statement
 * @param T is the type of the declared variable, if known at compile time, otherwise put IType. 
 * That way java generics grant us some level of type checking of the generated code at compiler design time.
 * Sometimes we will not be able to use this though, because we will not know T at compiler design time.
 */
public final class Identifier extends Expression {


	private String name;

	public Identifier(IType type, String name) {
		super(type);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return GoolGeneratorController.generator().getCode(this);
	}
	
	public String getName() {
		return name;
	}

}