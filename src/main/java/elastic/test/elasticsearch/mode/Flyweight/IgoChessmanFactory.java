package elastic.test.elasticsearch.mode.Flyweight;

import java.util.Hashtable;

public class IgoChessmanFactory {

	private static IgoChessmanFactory factory = new IgoChessmanFactory();
	//创建享元池
	private static Hashtable<String, IgoChessman> ht;
	
	private IgoChessmanFactory() {
		ht = new Hashtable<>();
		IgoChessman black, white;
		black = new BlackIgoChessman();
		ht.put("b", black);
		white = new WhiteIgoChessman();
		ht.put("w", white);
	}
	
	public static IgoChessmanFactory getInstance() {
		return factory;
	}
	
	//获取享元对象
	public IgoChessman getIgoChessman(String color) {
		return ht.get(color);
	}
}
