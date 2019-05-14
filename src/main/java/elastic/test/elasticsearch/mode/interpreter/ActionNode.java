package elastic.test.elasticsearch.mode.interpreter;

public class ActionNode extends AbstractNode{

	private String action;
	
	public ActionNode(String action) {
		this.action = action;
	}
	
	@Override
	public String interpret(Context cx) {
		if(action.equalsIgnoreCase("run")) {
			return "快速移动";
		}else if(action.equalsIgnoreCase("move")) {
			return "移动";
		}else {
			return "无效指令";
		}
	}

}
