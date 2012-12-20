package gool.ast.type;

import gool.generator.GoolGeneratorController;



/**
 * This is the basic type Method of the intermediate language.
 */
public final class TypePackage extends IType {

	private String textualtype;
	
	public String getTextualtype() {
		return textualtype;
	}

	public TypePackage(String textualtype) {this.textualtype=textualtype;}

	@Override
	public String getName() {
		return callGetCode();
	}
	
	@Override
	public String callGetCode() {
		return GoolGeneratorController.generator().getCode(this);
	}
	
}
