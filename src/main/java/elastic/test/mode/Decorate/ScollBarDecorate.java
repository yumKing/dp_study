package elastic.test.mode.Decorate;

public class ScollBarDecorate extends Decorate{

	public ScollBarDecorate(Component ct) {
		super(ct);
	}

	@Override
	public void addBehavior() {
		//TODO:具体新增的操作
		System.out.println("添加滑动块");
	}
	
}
