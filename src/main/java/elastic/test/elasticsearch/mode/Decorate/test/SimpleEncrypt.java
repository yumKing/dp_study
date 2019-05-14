package elastic.test.elasticsearch.mode.Decorate.test;

public class SimpleEncrypt extends DecorateEncrypt{

	public SimpleEncrypt(IEncrypt it) {
		super(it);
	}

	@Override
	public String addEncrypt(String en) {
		System.out.println("简单加密算法");
		return "simple:" + en +"AND";
	}

}
