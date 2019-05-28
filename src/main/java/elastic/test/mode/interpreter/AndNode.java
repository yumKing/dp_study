package elastic.test.mode.interpreter;

public class AndNode extends AbstractNode{

	private AbstractNode left;
	private AbstractNode right;
	
	public AndNode(AbstractNode left,AbstractNode right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String interpret(Context cx) {
		return left.interpret(cx) + "再" + right.interpret(cx);
	}

}
