package elastic.test.elasticsearch.mode.Decorate.test;

/**
 * 	开发了一个数据加密模块，可以对字符串进行加密
 * @author jinyang
 *
 */
public class Client {

	public static void main(String[] args) {
		IEncrypt it ;
		it = new StringEncrypt("abcde");
		
//		it = new SimpleEncrypt(it);
//		it = new CommonEncrypt(it);
		it = new ComplexEncrypt(it);
		System.out.println(it.encrypt());
		
	}
}
