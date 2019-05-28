package elastic.test.mode.bridge.test;

public class PNGImage extends Image{

	@Override
	public void display() {
		System.out.println("在" + os.getOS() + "系统中显示PNG图片");
	}

}
