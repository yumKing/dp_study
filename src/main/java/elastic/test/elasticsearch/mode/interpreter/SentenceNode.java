package elastic.test.elasticsearch.mode.interpreter;

public class SentenceNode extends AbstractNode{

	private AbstractNode action;
	private AbstractNode direction;
	private AbstractNode distance;
	
	public SentenceNode(AbstractNode action, AbstractNode direction, AbstractNode distance) {
		this.action = action;
		this.direction = direction;
		this.distance = distance;
	}

	@Override
	public String interpret(Context cx) {
		return direction.interpret(cx) + action.interpret(cx) + distance.interpret(cx);
	}

}
