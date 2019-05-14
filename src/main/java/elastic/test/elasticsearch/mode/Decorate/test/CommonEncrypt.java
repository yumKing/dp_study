package elastic.test.elasticsearch.mode.Decorate.test;

public class CommonEncrypt extends DecorateEncrypt{

	public CommonEncrypt(IEncrypt it) {
		super(it);
	}

	@Override
	public String addEncrypt(String en) {
		System.out.println("一般加密算法");
		return "common:" + en + "AND";
	}

}
