package gool.ast.type;



/**
 * This is the basic type Bool of the intermediate language.
 */
public final class TypeUnknown extends PrimitiveType {

	private String textualtype;
	
	public String getTextualtype() {
		return textualtype;
	}

	public TypeUnknown(String textualtype) {this.textualtype=textualtype;}

	@Override
	public String getName() {
		return toString();
	}
	
}
