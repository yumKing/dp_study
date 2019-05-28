package elastic.test.mode.Flyweight.test;

public abstract class DocResource {

	public abstract String setType();
	
	public void show(Point point, Act act) {
		System.out.println(this.setType() + "在文档中的位置为：" + point.toString() + ", 其宽和高为：" + act.toString());
	}

}
