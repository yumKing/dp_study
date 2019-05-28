package elastic.test.mode.Decorate;

public abstract class Decorate implements Component{
	
	//先调用原有的业务，再扩充其他操作
	private Component ct;
	
	public Decorate(Component ct) {
		this.ct = ct;
	}
	
	public abstract void addBehavior();
	
	public void operate() {
		//TODO:扩充其他操作,具体操作交给实现类
		addBehavior();
		
		ct.operate();
	}
}
