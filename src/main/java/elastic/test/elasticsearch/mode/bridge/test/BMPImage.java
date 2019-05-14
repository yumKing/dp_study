package elastic.test.elasticsearch.mode.bridge.test;

public class BMPImage extends Image{

	@Override
	public void display() {
		System.out.println("在" + os.getOS() + "系统中显示BMP图片");
	}

}
