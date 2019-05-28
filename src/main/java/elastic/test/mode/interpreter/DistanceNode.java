package elastic.test.mode.interpreter;

public class DistanceNode extends AbstractNode{

	private String distance;
	
	public DistanceNode(String distance) {
		this.distance = distance;
	}

	
	@Override
	public String interpret(Context cx) {
		return this.distance;
	}

}
