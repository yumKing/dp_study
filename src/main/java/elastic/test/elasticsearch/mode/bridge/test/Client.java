package elastic.test.elasticsearch.mode.bridge.test;

/**
 * 	跨平台图像浏览系统  不同格式的图像文件，可以在不同的系统中显示出来
 * @author jinyang
 *
 */
public class Client {
	public static void main(String[] args) {
		//要展示的图片
		Image image = new PNGImage();
		//要在哪个系统上展示
		image.setOS(new LinuxOS());
		//展示
		image.display();
	}
}
