package elastic.test.elasticsearch.mode.bridge;

public class SmallBrush extends Brush{

	@Override
	public void draw() {
		System.out.println("使用小笔刷," + color.getColor() + "画画");
	}

}
