package elastic.test.mode.bridge;

/**
 * 	假如我们需要大中小3种型号的画笔，能够绘制12种不同的颜色，
 * 	如果使用蜡笔，需要准备3×12 = 36支，
 * 	但如果使用毛笔的话，只需要提供3种型号的毛笔，外加12个颜料盒即可
 * 	涉及到的对象个数仅为 3 + 12 = 15，远少于36，却能实现与36支蜡笔同样的功能
 * 	在蜡笔中，颜色和型号两个不同的变化维度（即两个不同的变化原因）融合在一起，无论是对颜色进行扩展还是对型号进行扩展都势必会影响另一个维度
 *	蜡笔中颜色和型号之间存在较强的耦合性
 *	在毛笔中，颜色和型号实现了分离，增加新的颜色或者型号对另一方都没有任何影响
 *	而毛笔很好地将二者解耦
 *	
 * 	桥接模式 ,  处理与画笔类似的具有多变化维度的情况
 * @author jinyang
 *
 */
public class Client {

	public static void main(String[] args) {
		//这里只是举例说明，其实颜色可以使用枚举就可以了
		//选择画笔
		Brush brush = new BigBrush();
		//设置画笔颜色
		Color color = new BlueColor();
		brush.setColor(color);
		//画画
		brush.draw();
	}
}
