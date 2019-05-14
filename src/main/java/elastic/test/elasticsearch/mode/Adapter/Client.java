package elastic.test.elasticsearch.mode.Adapter;

/**
 * 	笔记本电脑的工作电压是20V，而我国的家庭用电是220V，
 * 	如何让20V的笔记本电脑能够在220V的电压下工作？
 * 	答案是引入一个电源适配器(AC Adapter)，俗称充电器或变压器，
 * 	有了这个电源适配器，生活用电和笔记本电脑即可兼容
 * 
 * 	适配器模式
 * @author jinyang
 *
 */
public class Client {

	public static void main(String[] args) {
		ScoreOperation op = new OperateAdapter();
		
		int scores[] = {84,76,50,69,90,91,88,96};
		int result[];
		int score;
		System.out.println("成绩排序结果：");
		result = op.sort(scores);
		for(int i : result) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		System.out.println("查找成绩90：");
		score = op.search(result,90);
		if (score != -1) {
			System.out.println("找到成绩90。");
		}
		else {
			System.out.println("没有找到成绩90。");
		}
	}
}
