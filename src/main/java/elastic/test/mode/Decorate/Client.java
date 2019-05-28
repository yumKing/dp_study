package elastic.test.mode.Decorate;
/**
 *	 装饰者模式
 * 	开发了一套图形界面构件库VisualComponent，该构件库提供了大量基本构件，
 * 	如窗体、文本框、列表框等，由于在使用该构件库时，用户经常要求定制一些特效显示效果，
 * 	如带滚动条的窗体、带黑色边框的文本框、既带滚动条又带黑色边框的列表框等等，
 * 	因此经常需要对该构件库进行扩展以增强其功能
 * @author jinyang
 *
 */
public class Client {

	public static void main(String[] args) {
		Component ct = new TextBox();
//		Decorate d1 = new ScollBarDecorate(ct);
//		Decorate de = new BlackBoldDecorate(d1);
//		de.operate();
//		de.addBehavior();
//		d1.addBehavior();
		
		Component d1 = new ScollBarDecorate(ct);
		Component de = new BlackBoldDecorate(d1);
		de.operate();
	}
}
