package elastic.test.elasticsearch.mode.Flyweight;

public abstract class IgoChessman {

	public abstract String getColor();
	
	public void display(Coordinates cs) {
		System.out.println("棋子颜色：" + this.getColor() + ",棋子位置：" + cs.toString());
	}
}
