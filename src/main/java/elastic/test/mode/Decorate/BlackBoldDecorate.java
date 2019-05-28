package elastic.test.mode.Decorate;

public class BlackBoldDecorate extends Decorate{

	public BlackBoldDecorate(Component ct) {
		super(ct);
	}

	@Override
	public void addBehavior() {
		//TODO:具体新增的操作
		System.out.println("添加黑色边框");
	}

}
