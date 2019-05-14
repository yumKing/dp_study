package elastic.test.elasticsearch.mode.Prototype;

/**
 * 	原型模式
 * @author jinyang
 *
 */
public class Client {
	public static void main(String[] args) {
		MyObject mt = new MyObject();
		
		IProtoType myclone = mt.myclone();
		System.out.println(mt.equals(myclone));
	}
}
