package elastic.test.elasticsearch.mode.bridge.test;

public class GIFImage extends Image{

	@Override
	public void display() {
		System.out.println("在" + os.getOS() + "系统中显示GIF图片");		
	}

}
