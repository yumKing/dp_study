package elastic.test.elasticsearch.mode.bridge;

public class BigBrush extends Brush{

	@Override
	public void draw() {
		System.out.println("使用大笔刷," + color.getColor() + "画画");
	}

}
